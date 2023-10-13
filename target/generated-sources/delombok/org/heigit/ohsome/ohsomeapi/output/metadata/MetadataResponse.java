package org.heigit.ohsome.ohsomeapi.output.metadata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.annotations.ApiModelProperty;
import org.heigit.ohsome.ohsomeapi.output.Attribution;

/**
 * Represents the JSON response object for the /metadata request. It contains information about the
 * attribution, the version of the API and the {@link
 * org.heigit.ohsome.ohsomeapi.output.metadata.ExtractRegion ExtractRegion}.
 */
@JsonInclude(Include.NON_NULL)
public class MetadataResponse {
  @ApiModelProperty(notes = "License and copyright info", required = true, position = 0)
  private Attribution attribution;
  @ApiModelProperty(notes = "Specific version of this API", required = true, position = 1)
  private String apiVersion;
  @ApiModelProperty(notes = "Maximal response timeout in seconds", required = true, position = 2)
  private double timeout;
  @ApiModelProperty(notes = "Extract region object holding the spatial|temporal extent + attribution", required = true, position = 3)
  private ExtractRegion extractRegion;

  @java.lang.SuppressWarnings("all")
  public Attribution getAttribution() {
    return this.attribution;
  }

  @java.lang.SuppressWarnings("all")
  public String getApiVersion() {
    return this.apiVersion;
  }

  @java.lang.SuppressWarnings("all")
  public double getTimeout() {
    return this.timeout;
  }

  @java.lang.SuppressWarnings("all")
  public ExtractRegion getExtractRegion() {
    return this.extractRegion;
  }

  @java.lang.SuppressWarnings("all")
  public MetadataResponse(final Attribution attribution, final String apiVersion, final double timeout, final ExtractRegion extractRegion) {
    this.attribution = attribution;
    this.apiVersion = apiVersion;
    this.timeout = timeout;
    this.extractRegion = extractRegion;
  }
}
