pipeline {
    agent { label 'worker' }
    options {
        timeout(time: 30, unit: 'MINUTES')
    }
    tools {
        maven 'Maven 3'
    }

    environment {
        // START CUSTOM ohsome API
        MAVEN_TEST_OPTIONS = '-Dport_get=8081 -Dport_post=8082 -Dport_data=8083 -DdbFilePathProperty=--database.db=/data/heidelberg-v1.0-beta.oshdb'
        // END CUSTOM ohsome API
        SNAPSHOT_BRANCH_REGEX = /(^master$)/
        RELEASE_REGEX = /^([0-9]+(\.[0-9]+)*)(-(RC|beta-|alpha-)[0-9]+)?$/
        RELEASE_DEPLOY = false
        SNAPSHOT_DEPLOY = false
    }

    stages {
        stage('Build and Test') {
            steps {
                // setting up a few basic env variables like REPO_NAME and LATEST_AUTHOR
                setup_basic_env()

                mavenbuild('clean compile javadoc:jar source:jar verify -P jacoco,sign,git')
            }
            post {
                failure {
                    rocket_buildfail()
                    rocket_testfail()
                }
            }
        }

        stage('Reports and Statistics') {
            steps {
                reports_sonar_jacoco()
            }
        }

        stage('Deploy Snapshot') {
            when {
                expression {
                    return env.BRANCH_NAME ==~ SNAPSHOT_BRANCH_REGEX && VERSION ==~ /.*-SNAPSHOT$/
                }
            }
            steps {
                deploy_snapshot('clean compile javadoc:jar source:jar deploy -P sign,git -DskipTests=true')
            }
            post {
                failure {
                    rocket_snapshotdeployfail()
                }
            }
        }

        stage('Deploy Release') {
            when {
                expression {
                    return VERSION ==~ RELEASE_REGEX && env.TAG_NAME ==~ RELEASE_REGEX
                }
            }
            steps {
                deploy_release('clean compile javadoc:jar source:jar deploy -P sign,git -DskipTests=true')

                withCredentials([
            file(credentialsId: 'ossrh-settings', variable: 'settingsFile'),
            string(credentialsId: 'gpg-signing-key-passphrase', variable: 'PASSPHRASE')
        ]) {
                    sh 'mvn --batch-mode --update-snapshots clean compile -s $settingsFile javadoc:jar source:jar deploy -P sign,git,deploy-central -Dmaven.repo.local=.m2  -Dgpg.passphrase=$PASSPHRASE -DskipTests=true'
        }
            }
            post {
                failure {
                    rocket_releasedeployfail()
                }
            }
        }

        // START CUSTOM ohsome API
        stage('Publish API Docs') {
            when {
                anyOf {
                    equals expected: true, actual: RELEASE_DEPLOY
                    equals expected: true, actual: SNAPSHOT_DEPLOY
                }
            }
            steps {
                script {
                    DOC_RELEASE_REGEX = /^([0-9]+(\.[0-9]+)*)$/
                    DOCS_DEPLOYMENT = 'development'
                    API_DOCS_PATH = 'development'
                    if (VERSION ==~ DOC_RELEASE_REGEX) {
                        DOCS_DEPLOYMENT = 'release'
                        API_DOCS_PATH = sh(returnStdout: true, script: 'cd docs && python3 get_pom_metadata.py | awk \'/^Path:/{ print $2 }\'').trim()
                    }

                    publish_dir = "/srv/javadoc/${REPO_NAME}/${API_DOCS_PATH}/"
                    venv_dir = sh(returnStdout: true, script: 'mktemp -d --suffix .sphinx-docs').trim() + '/venv'

                    if (!fileExists("${venv_dir}")) {
                        sh "python3 -m venv ${venv_dir}"
                    }

                    sh """
            source ${venv_dir}/bin/activate
            cd docs
            python3 -m pip install -U pip
            python3 -m pip install -r requirements.txt
            DOCS_DEPLOYMENT=${DOCS_DEPLOYMENT} make clean html
          """
                    sh "mkdir -p ${publish_dir} && rm -rf ${publish_dir}* && cp -r docs/_build/html/* ${publish_dir}"
                    sh "rm -rf ${venv_dir}"
                }
            }
            post {
                failure {
                    sh "rm -rf ${venv_dir}"
                    rocket_basicsend("Deployment of api docs ${env.REPO_NAME}-build nr. ${env.BUILD_NUMBER} *failed* on Branch - ${env.BRANCH_NAME}  (<${env.BUILD_URL}|Open Build in Jenkins>). Latest commit from  ${env.LATEST_AUTHOR}.")
                }
            }
        }
    // END CUSTOM ohsome API

        stage('Check Dependencies') {
            when {
                expression { 
                    if (currentBuild.number > 1) {
                        return (((currentBuild.getStartTimeInMillis() - currentBuild.previousBuild.getStartTimeInMillis()) > 2592000000000) && (env.BRANCH_NAME ==~ SNAPSHOT_BRANCH_REGEX)) //2592000000000 one month in milliseconds
                    }
                    return false
                }
            }
            steps {
                check_dependencies()
            }
        }

        stage('Wrapping Up') {
            steps {
                encourage()
                status_change()
            }
        }
    }
}
