package org.heigit.ohsome.ohsomeapi.inputprocessing;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import org.geojson.GeoJsonObject;
import org.heigit.ohsome.ohsomeapi.executor.RequestParameters;
import org.heigit.ohsome.oshdb.filter.FilterExpression;
import org.heigit.ohsome.oshdb.osm.OSMType;
import org.locationtech.jts.geom.Geometry;

/**
 * Holds the relevant objects for processing the request and creating the response.
 */
public class ProcessingData implements Serializable {
  private static Geometry dataPolyGeom;
  private static double timeout;
  private static int numberOfDataExtractionThreads = 1;
  private RequestParameters requestParameters;
  private String requestUrl;
  private BoundaryType boundaryType;
  private String[] boundaryValues;
  private String boundaryValuesGeoJson;
  private EnumSet<OSMType> osmTypes;
  private boolean showMetadata;
  private String format;
  private Geometry requestGeom;
  private List<Geometry> boundaryList;
  private GeoJsonObject[] geoJsonGeoms;
  private boolean isContainingSimpleFeatureTypes;
  private EnumSet<SimpleFeatureType> simpleFeatureTypes;
  private static int numberOfClusterNodes;
  private boolean isRatio;
  private boolean isGroupByBoundary;
  private boolean isFullHistory;
  private FilterExpression filterExpression;

  public ProcessingData(RequestParameters requestParameters, String requestUrl) {
    this.requestParameters = requestParameters;
    this.requestUrl = requestUrl;
    this.isRatio = false;
    this.isGroupByBoundary = false;
    this.isFullHistory = false;
  }

  // Override @Getter of Lombok
  public Optional<FilterExpression> getFilterExpression() {
    return Optional.ofNullable(this.filterExpression);
  }

  @java.lang.SuppressWarnings("all")
  public RequestParameters getRequestParameters() {
    return this.requestParameters;
  }

  @java.lang.SuppressWarnings("all")
  public String getRequestUrl() {
    return this.requestUrl;
  }

  @java.lang.SuppressWarnings("all")
  public BoundaryType getBoundaryType() {
    return this.boundaryType;
  }

  @java.lang.SuppressWarnings("all")
  public String[] getBoundaryValues() {
    return this.boundaryValues;
  }

  @java.lang.SuppressWarnings("all")
  public String getBoundaryValuesGeoJson() {
    return this.boundaryValuesGeoJson;
  }

  @java.lang.SuppressWarnings("all")
  public EnumSet<OSMType> getOsmTypes() {
    return this.osmTypes;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isShowMetadata() {
    return this.showMetadata;
  }

  @java.lang.SuppressWarnings("all")
  public String getFormat() {
    return this.format;
  }

  @java.lang.SuppressWarnings("all")
  public Geometry getRequestGeom() {
    return this.requestGeom;
  }

  @java.lang.SuppressWarnings("all")
  public List<Geometry> getBoundaryList() {
    return this.boundaryList;
  }

  @java.lang.SuppressWarnings("all")
  public GeoJsonObject[] getGeoJsonGeoms() {
    return this.geoJsonGeoms;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isContainingSimpleFeatureTypes() {
    return this.isContainingSimpleFeatureTypes;
  }

  @java.lang.SuppressWarnings("all")
  public EnumSet<SimpleFeatureType> getSimpleFeatureTypes() {
    return this.simpleFeatureTypes;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isRatio() {
    return this.isRatio;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isGroupByBoundary() {
    return this.isGroupByBoundary;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isFullHistory() {
    return this.isFullHistory;
  }

  @java.lang.SuppressWarnings("all")
  public void setRequestParameters(final RequestParameters requestParameters) {
    this.requestParameters = requestParameters;
  }

  @java.lang.SuppressWarnings("all")
  public void setRequestUrl(final String requestUrl) {
    this.requestUrl = requestUrl;
  }

  @java.lang.SuppressWarnings("all")
  public void setBoundaryType(final BoundaryType boundaryType) {
    this.boundaryType = boundaryType;
  }

  @java.lang.SuppressWarnings("all")
  public void setBoundaryValues(final String[] boundaryValues) {
    this.boundaryValues = boundaryValues;
  }

  @java.lang.SuppressWarnings("all")
  public void setBoundaryValuesGeoJson(final String boundaryValuesGeoJson) {
    this.boundaryValuesGeoJson = boundaryValuesGeoJson;
  }

  @java.lang.SuppressWarnings("all")
  public void setOsmTypes(final EnumSet<OSMType> osmTypes) {
    this.osmTypes = osmTypes;
  }

  @java.lang.SuppressWarnings("all")
  public void setShowMetadata(final boolean showMetadata) {
    this.showMetadata = showMetadata;
  }

  @java.lang.SuppressWarnings("all")
  public void setFormat(final String format) {
    this.format = format;
  }

  @java.lang.SuppressWarnings("all")
  public void setRequestGeom(final Geometry requestGeom) {
    this.requestGeom = requestGeom;
  }

  @java.lang.SuppressWarnings("all")
  public void setBoundaryList(final List<Geometry> boundaryList) {
    this.boundaryList = boundaryList;
  }

  @java.lang.SuppressWarnings("all")
  public void setGeoJsonGeoms(final GeoJsonObject[] geoJsonGeoms) {
    this.geoJsonGeoms = geoJsonGeoms;
  }

  @java.lang.SuppressWarnings("all")
  public void setContainingSimpleFeatureTypes(final boolean isContainingSimpleFeatureTypes) {
    this.isContainingSimpleFeatureTypes = isContainingSimpleFeatureTypes;
  }

  @java.lang.SuppressWarnings("all")
  public void setSimpleFeatureTypes(final EnumSet<SimpleFeatureType> simpleFeatureTypes) {
    this.simpleFeatureTypes = simpleFeatureTypes;
  }

  @java.lang.SuppressWarnings("all")
  public void setRatio(final boolean isRatio) {
    this.isRatio = isRatio;
  }

  @java.lang.SuppressWarnings("all")
  public void setGroupByBoundary(final boolean isGroupByBoundary) {
    this.isGroupByBoundary = isGroupByBoundary;
  }

  @java.lang.SuppressWarnings("all")
  public void setFullHistory(final boolean isFullHistory) {
    this.isFullHistory = isFullHistory;
  }

  @java.lang.SuppressWarnings("all")
  public void setFilterExpression(final FilterExpression filterExpression) {
    this.filterExpression = filterExpression;
  }

  @java.lang.SuppressWarnings("all")
  public static Geometry getDataPolyGeom() {
    return ProcessingData.dataPolyGeom;
  }

  @java.lang.SuppressWarnings("all")
  public static void setDataPolyGeom(final Geometry dataPolyGeom) {
    ProcessingData.dataPolyGeom = dataPolyGeom;
  }

  @java.lang.SuppressWarnings("all")
  public static double getTimeout() {
    return ProcessingData.timeout;
  }

  @java.lang.SuppressWarnings("all")
  public static void setTimeout(final double timeout) {
    ProcessingData.timeout = timeout;
  }

  @java.lang.SuppressWarnings("all")
  public static int getNumberOfDataExtractionThreads() {
    return ProcessingData.numberOfDataExtractionThreads;
  }

  @java.lang.SuppressWarnings("all")
  public static void setNumberOfDataExtractionThreads(final int numberOfDataExtractionThreads) {
    ProcessingData.numberOfDataExtractionThreads = numberOfDataExtractionThreads;
  }

  @java.lang.SuppressWarnings("all")
  public static int getNumberOfClusterNodes() {
    return ProcessingData.numberOfClusterNodes;
  }

  @java.lang.SuppressWarnings("all")
  public static void setNumberOfClusterNodes(final int numberOfClusterNodes) {
    ProcessingData.numberOfClusterNodes = numberOfClusterNodes;
  }
}
