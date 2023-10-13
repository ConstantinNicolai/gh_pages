package org.heigit.ohsome.ohsomeapi.output.metadata;

import io.swagger.annotations.ApiModelProperty;

/**
 * Represents the result JSON object containing the from- and toTimestamps of the respective
 * data-extract.
 */
public class TemporalExtent {
  @ApiModelProperty(notes = "Timestamp in the format YYYY-MM-DDThh:mm:ssZ", required = true)
  private String fromTimestamp;
  @ApiModelProperty(notes = "Timestamp in the format YYYY-MM-DDThh:mm:ssZ", required = true)
  private String toTimestamp;

  @java.lang.SuppressWarnings("all")
  public String getFromTimestamp() {
    return this.fromTimestamp;
  }

  @java.lang.SuppressWarnings("all")
  public String getToTimestamp() {
    return this.toTimestamp;
  }

  @java.lang.SuppressWarnings("all")
  public TemporalExtent(final String fromTimestamp, final String toTimestamp) {
    this.fromTimestamp = fromTimestamp;
    this.toTimestamp = toTimestamp;
  }
}
