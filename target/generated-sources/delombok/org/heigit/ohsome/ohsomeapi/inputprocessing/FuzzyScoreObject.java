package org.heigit.ohsome.ohsomeapi.inputprocessing;

import java.math.BigDecimal;
import java.util.Comparator;

/**
 * Holds those variables which are relevant for the string similarity algorithm 'Fuzzy Score'.
 */
public class FuzzyScoreObject {
  private final BigDecimal fuzzyScore;
  private final String possibleParameter;
  /**
   * Sorts the request parameters by matching score.
   */
  static Comparator<FuzzyScoreObject> sortByScore = (o1, o2) -> o1.fuzzyScore.compareTo(o2.fuzzyScore);

  @java.lang.SuppressWarnings("all")
  public BigDecimal getFuzzyScore() {
    return this.fuzzyScore;
  }

  @java.lang.SuppressWarnings("all")
  public String getPossibleParameter() {
    return this.possibleParameter;
  }

  @java.lang.SuppressWarnings("all")
  public FuzzyScoreObject(final BigDecimal fuzzyScore, final String possibleParameter) {
    this.fuzzyScore = fuzzyScore;
    this.possibleParameter = possibleParameter;
  }
}
