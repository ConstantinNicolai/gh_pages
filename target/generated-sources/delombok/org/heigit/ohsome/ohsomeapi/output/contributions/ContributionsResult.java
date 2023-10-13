package org.heigit.ohsome.ohsomeapi.output.contributions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.annotations.ApiModelProperty;
import org.heigit.ohsome.ohsomeapi.output.Result;

/**
 * Represents the result JSON object for the resources working with contributions (currently:
 * /users and /contributions/count) containing the from timestamp together with the corresponding
 * value.
 */
@JsonInclude(Include.NON_NULL)
public class ContributionsResult implements Result {
  @ApiModelProperty(notes = "Timestamp in the format YYYY-MM-DDThh:mm:ssZ", required = true)
  private String fromTimestamp;
  @ApiModelProperty(notes = "Timestamp in the format YYYY-MM-DDThh:mm:ssZ", required = true)
  private String toTimestamp;
  @ApiModelProperty(notes = "Value corresponding to the filter parameters", required = true)
  private double value;

  @java.lang.SuppressWarnings("all")
  public String getFromTimestamp() {
    return this.fromTimestamp;
  }

  @java.lang.SuppressWarnings("all")
  public String getToTimestamp() {
    return this.toTimestamp;
  }

  @java.lang.SuppressWarnings("all")
  public double getValue() {
    return this.value;
  }

  @java.lang.SuppressWarnings("all")
  public ContributionsResult(final String fromTimestamp, final String toTimestamp, final double value) {
    this.fromTimestamp = fromTimestamp;
    this.toTimestamp = toTimestamp;
    this.value = value;
  }
}
