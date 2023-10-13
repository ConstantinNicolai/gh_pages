package org.heigit.ohsome.ohsomeapi.output.ratio;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.annotations.ApiModelProperty;
import org.heigit.ohsome.ohsomeapi.output.Attribution;
import org.heigit.ohsome.ohsomeapi.output.Metadata;
import org.heigit.ohsome.ohsomeapi.output.Response;

/**
 * Represents the whole JSON response object for the data aggregation response using the /ratio
 * resource. It contains the license and copyright, optional {@link
 * org.heigit.ohsome.ohsomeapi.output.Metadata Metadata}, as well as the results section showing
 * {@link org.heigit.ohsome.ohsomeapi.output.ratio.RatioResult RatioResult} objects.
 */
@JsonInclude(Include.NON_NULL)
public class RatioResponse implements Response {
  @ApiModelProperty(notes = "License and copyright info", required = true)
  private Attribution attribution;
  @ApiModelProperty(notes = "Version of this api", required = true)
  private String apiVersion;
  @ApiModelProperty(notes = "Metadata describing the output")
  private Metadata metadata;
  @ApiModelProperty(notes = "ElementsResult for /ratio requests", required = true)
  private RatioResult[] ratioResult;

  @java.lang.SuppressWarnings("all")
  public Attribution getAttribution() {
    return this.attribution;
  }

  @java.lang.SuppressWarnings("all")
  public String getApiVersion() {
    return this.apiVersion;
  }

  @java.lang.SuppressWarnings("all")
  public Metadata getMetadata() {
    return this.metadata;
  }

  @java.lang.SuppressWarnings("all")
  public RatioResult[] getRatioResult() {
    return this.ratioResult;
  }

  @java.lang.SuppressWarnings("all")
  public RatioResponse(final Attribution attribution, final String apiVersion, final Metadata metadata, final RatioResult[] ratioResult) {
    this.attribution = attribution;
    this.apiVersion = apiVersion;
    this.metadata = metadata;
    this.ratioResult = ratioResult;
  }
}
