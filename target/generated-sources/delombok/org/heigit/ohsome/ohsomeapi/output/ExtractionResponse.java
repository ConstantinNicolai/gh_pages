package org.heigit.ohsome.ohsomeapi.output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.wololo.geojson.Feature;

/**
 * Represents the whole GeoJSON response object for the data-extraction and contributions endpoints
 * that always extract the data as GeoJSON, e.g. /elements/geometry or /contributions/geometry.
 */
@JsonInclude(Include.NON_NULL)
public class ExtractionResponse implements Response {
  @ApiModelProperty(notes = "License and copyright info", required = true)
  private Attribution attribution;
  @ApiModelProperty(notes = "Version of this api", required = true)
  private String apiVersion;
  @ApiModelProperty(notes = "Metadata describing the output")
  private Metadata metadata;
  @ApiModelProperty(notes = "Type of the GeoJSON", required = true)
  private String type;
  @ApiModelProperty(notes = "List of GeoJSON features containing the OSM data")
  private List<Feature> features;

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
  public String getType() {
    return this.type;
  }

  @java.lang.SuppressWarnings("all")
  public List<Feature> getFeatures() {
    return this.features;
  }

  @java.lang.SuppressWarnings("all")
  public ExtractionResponse(final Attribution attribution, final String apiVersion, final Metadata metadata, final String type, final List<Feature> features) {
    this.attribution = attribution;
    this.apiVersion = apiVersion;
    this.metadata = metadata;
    this.type = type;
    this.features = features;
  }
}
