package org.heigit.ohsome.ohsomeapi.output.elements;

import io.swagger.annotations.ApiModelProperty;
import org.heigit.ohsome.ohsomeapi.output.Result;

/**
 * Represents the result JSON object for most of the /elements resources containing the timestamp
 * together with the corresponding value.
 */
public class ElementsResult implements Result {
  @ApiModelProperty(notes = "Timestamp in the format YYYY-MM-DDThh:mm:ssZ", required = true)
  private String timestamp;
  @ApiModelProperty(notes = "Value corresponding to the filter parameters", required = true)
  private double value;

  @java.lang.SuppressWarnings("all")
  public String getTimestamp() {
    return this.timestamp;
  }

  @java.lang.SuppressWarnings("all")
  public double getValue() {
    return this.value;
  }

  @java.lang.SuppressWarnings("all")
  public ElementsResult(final String timestamp, final double value) {
    this.timestamp = timestamp;
    this.value = value;
  }
}
