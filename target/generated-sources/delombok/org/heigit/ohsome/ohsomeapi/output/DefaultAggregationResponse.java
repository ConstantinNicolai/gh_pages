package org.heigit.ohsome.ohsomeapi.output;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.annotations.ApiModelProperty;
import org.geojson.Feature;

/**
 * Represents the outer JSON response object for the data aggregation requests that do not use the
 * /groupBy resource. It contains attribution info, the version of the api, optional {@link
 * org.heigit.ohsome.ohsomeapi.output.Metadata Metadata} and the {@link
 * org.heigit.ohsome.ohsomeapi.output.elements.ElementsResult ElementsResult} objects.
 */
@JsonInclude(Include.NON_NULL)
public class DefaultAggregationResponse implements Response {
  @ApiModelProperty(notes = "License and copyright info", required = true)
  private Attribution attribution;
  @ApiModelProperty(notes = "Version of this api", required = true)
  private String apiVersion;
  @ApiModelProperty(notes = "Metadata describing the output")
  private Metadata metadata;
  @ApiModelProperty(notes = "Type of the GeoJSON", required = true)
  private String type;
  @ApiModelProperty(notes = "GeoJSON Features", required = true)
  private Feature[] features;
  @ApiModelProperty(notes = "ElementsResult holding timestamp-value pairs", required = true)
  private Result[] result;

  /**
   * Static factory method returning the whole JSON response.
   */
  public static DefaultAggregationResponse of(Attribution attribution, String apiVersion, Metadata metadata, Result[] result) {
    DefaultAggregationResponse response = new DefaultAggregationResponse();
    response.attribution = attribution;
    response.apiVersion = apiVersion;
    response.metadata = metadata;
    response.result = result;
    return response;
  }

  /**
   * Static factory method returning JSON without attribution and apiVersion.
   */
  public static DefaultAggregationResponse of(Metadata metadata, Result[] result) {
    DefaultAggregationResponse response = new DefaultAggregationResponse();
    response.metadata = metadata;
    response.result = result;
    return response;
  }

  /**
   * Static factory method returning the whole GeoJSON response.
   */
  public static DefaultAggregationResponse of(Attribution attribution, String apiVersion, Metadata metadata, String type, Feature[] features) {
    DefaultAggregationResponse response = new DefaultAggregationResponse();
    response.attribution = attribution;
    response.apiVersion = apiVersion;
    response.metadata = metadata;
    response.type = type;
    response.features = features;
    return response;
  }

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
  public Feature[] getFeatures() {
    return this.features;
  }

  @java.lang.SuppressWarnings("all")
  public Result[] getResult() {
    return this.result;
  }

  @java.lang.SuppressWarnings("all")
  private DefaultAggregationResponse() {
  }
}
