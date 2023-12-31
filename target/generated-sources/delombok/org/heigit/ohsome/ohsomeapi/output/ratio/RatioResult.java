package org.heigit.ohsome.ohsomeapi.output.ratio;

import io.swagger.annotations.ApiModelProperty;
import org.heigit.ohsome.ohsomeapi.output.Result;

/**
 * Represents the result JSON object for the /ratio resource containing the timestamp together with
 * two values and their resulting ratio.
 */
public class RatioResult implements Result {
  @ApiModelProperty(notes = "Timestamp in the format YYYY-MM-DDThh:mm:ssZ", required = true)
  private String timestamp;
  @ApiModelProperty(notes = "Value corresponding to the initial filter parameters", required = true)
  private double value;
  @ApiModelProperty(notes = "Value corresponding to the second (2) filter parameters", required = true)
  private double value2;
  @ApiModelProperty(notes = "Ratio of value2/value", required = true)
  private double ratio;

  @java.lang.SuppressWarnings("all")
  public String getTimestamp() {
    return this.timestamp;
  }

  @java.lang.SuppressWarnings("all")
  public double getValue() {
    return this.value;
  }

  @java.lang.SuppressWarnings("all")
  public double getValue2() {
    return this.value2;
  }

  @java.lang.SuppressWarnings("all")
  public double getRatio() {
    return this.ratio;
  }

  @java.lang.SuppressWarnings("all")
  public RatioResult(final String timestamp, final double value, final double value2, final double ratio) {
    this.timestamp = timestamp;
    this.value = value;
    this.value2 = value2;
    this.ratio = ratio;
  }
}
