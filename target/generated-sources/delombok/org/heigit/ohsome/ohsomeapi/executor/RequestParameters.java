package org.heigit.ohsome.ohsomeapi.executor;

import java.io.Serializable;

/**
 * Holds those parameters, which are relevant for every request.
 */
public class RequestParameters implements Serializable {
  private String requestMethod;
  private boolean isSnapshot;
  private boolean isDensity;
  private String bboxes;
  private String bcircles;
  private String bpolys;
  private String[] types;
  private String[] keys;
  private String[] values;
  private String[] time;
  private String format;
  private String showMetadata;
  private double timeout;
  private String filter;

  @java.lang.SuppressWarnings("all")
  public String getRequestMethod() {
    return this.requestMethod;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isSnapshot() {
    return this.isSnapshot;
  }

  @java.lang.SuppressWarnings("all")
  public boolean isDensity() {
    return this.isDensity;
  }

  @java.lang.SuppressWarnings("all")
  public String getBboxes() {
    return this.bboxes;
  }

  @java.lang.SuppressWarnings("all")
  public String getBcircles() {
    return this.bcircles;
  }

  @java.lang.SuppressWarnings("all")
  public String getBpolys() {
    return this.bpolys;
  }

  @java.lang.SuppressWarnings("all")
  public String[] getTypes() {
    return this.types;
  }

  @java.lang.SuppressWarnings("all")
  public String[] getKeys() {
    return this.keys;
  }

  @java.lang.SuppressWarnings("all")
  public String[] getValues() {
    return this.values;
  }

  @java.lang.SuppressWarnings("all")
  public String[] getTime() {
    return this.time;
  }

  @java.lang.SuppressWarnings("all")
  public String getFormat() {
    return this.format;
  }

  @java.lang.SuppressWarnings("all")
  public String getShowMetadata() {
    return this.showMetadata;
  }

  @java.lang.SuppressWarnings("all")
  public double getTimeout() {
    return this.timeout;
  }

  @java.lang.SuppressWarnings("all")
  public String getFilter() {
    return this.filter;
  }

  @java.lang.SuppressWarnings("all")
  public void setRequestMethod(final String requestMethod) {
    this.requestMethod = requestMethod;
  }

  @java.lang.SuppressWarnings("all")
  public void setSnapshot(final boolean isSnapshot) {
    this.isSnapshot = isSnapshot;
  }

  @java.lang.SuppressWarnings("all")
  public void setDensity(final boolean isDensity) {
    this.isDensity = isDensity;
  }

  @java.lang.SuppressWarnings("all")
  public void setBboxes(final String bboxes) {
    this.bboxes = bboxes;
  }

  @java.lang.SuppressWarnings("all")
  public void setBcircles(final String bcircles) {
    this.bcircles = bcircles;
  }

  @java.lang.SuppressWarnings("all")
  public void setBpolys(final String bpolys) {
    this.bpolys = bpolys;
  }

  @java.lang.SuppressWarnings("all")
  public void setTypes(final String[] types) {
    this.types = types;
  }

  @java.lang.SuppressWarnings("all")
  public void setKeys(final String[] keys) {
    this.keys = keys;
  }

  @java.lang.SuppressWarnings("all")
  public void setValues(final String[] values) {
    this.values = values;
  }

  @java.lang.SuppressWarnings("all")
  public void setTime(final String[] time) {
    this.time = time;
  }

  @java.lang.SuppressWarnings("all")
  public void setFormat(final String format) {
    this.format = format;
  }

  @java.lang.SuppressWarnings("all")
  public void setShowMetadata(final String showMetadata) {
    this.showMetadata = showMetadata;
  }

  @java.lang.SuppressWarnings("all")
  public void setTimeout(final double timeout) {
    this.timeout = timeout;
  }

  @java.lang.SuppressWarnings("all")
  public void setFilter(final String filter) {
    this.filter = filter;
  }

  @java.lang.SuppressWarnings("all")
  public RequestParameters(final String requestMethod, final boolean isSnapshot, final boolean isDensity, final String bboxes, final String bcircles, final String bpolys, final String[] types, final String[] keys, final String[] values, final String[] time, final String format, final String showMetadata, final double timeout, final String filter) {
    this.requestMethod = requestMethod;
    this.isSnapshot = isSnapshot;
    this.isDensity = isDensity;
    this.bboxes = bboxes;
    this.bcircles = bcircles;
    this.bpolys = bpolys;
    this.types = types;
    this.keys = keys;
    this.values = values;
    this.time = time;
    this.format = format;
    this.showMetadata = showMetadata;
    this.timeout = timeout;
    this.filter = filter;
  }
}
