package org.heigit.ohsome.ohsomeapi.output.metadata;

import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents the result JSON object containing the spatial extent as GeoJSON, the {@link
 * org.heigit.ohsome.ohsomeapi.output.metadata.TemporalExtent TemporalExtent} and the replication
 * sequence number of the data-extract.
 */
public class ExtractRegion {
  @ApiModelProperty(notes = "Spatial extent of this extract-region", required = true, position = 1)
  private JsonNode spatialExtent;
  @ApiModelProperty(notes = "Temporal extent of this extract-region", position = 2)
  private TemporalExtent temporalExtent;
  @ApiModelProperty(notes = "Replication sequence number", position = 3)
  private int replicationSequenceNumber;

  @java.lang.SuppressWarnings("all")
  public JsonNode getSpatialExtent() {
    return this.spatialExtent;
  }

  @java.lang.SuppressWarnings("all")
  public TemporalExtent getTemporalExtent() {
    return this.temporalExtent;
  }

  @java.lang.SuppressWarnings("all")
  public int getReplicationSequenceNumber() {
    return this.replicationSequenceNumber;
  }

  @java.lang.SuppressWarnings("all")
  public ExtractRegion(final JsonNode spatialExtent, final TemporalExtent temporalExtent, final int replicationSequenceNumber) {
    this.spatialExtent = spatialExtent;
    this.temporalExtent = temporalExtent;
    this.replicationSequenceNumber = replicationSequenceNumber;
  }
}
