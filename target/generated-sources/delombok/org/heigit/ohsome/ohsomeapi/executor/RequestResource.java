package org.heigit.ohsome.ohsomeapi.executor;

/**
 * Enumeration defining the request resource (LENGTH, PERIMETER, AREA, COUNT, GROUPBYTAG,
 * GROUPBYKEY, RATIO, DATAEXTRACTION, CONTRIBUTION).
 */
public enum RequestResource {
  LENGTH("length", "meters"), PERIMETER("perimeter", "meters"), AREA("area", "square meters"), COUNT("count", "absolute values"), GROUPBYTAG("", ""), GROUPBYKEY("", ""), RATIO("", ""), DATAEXTRACTION("OSM data as GeoJSON features.", ""), DATAEXTRACTIONFFULLHISTORY("Full-history OSM data as GeoJSON features.", ""), CONTRIBUTIONS("Contributions as GeoJSON features.", ""), CONTRIBUTIONSLATEST("Latest contributions as GeoJSON features.", "");
  private final String description;
  private final String unit;

  @java.lang.SuppressWarnings("all")
  public String getDescription() {
    return this.description;
  }

  @java.lang.SuppressWarnings("all")
  public String getUnit() {
    return this.unit;
  }

  @java.lang.SuppressWarnings("all")
  private RequestResource(final String description, final String unit) {
    this.description = description;
    this.unit = unit;
  }
}
