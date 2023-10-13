package org.heigit.ohsome.ohsomeapi.output;

import io.swagger.annotations.ApiModelProperty;

/**
 * Represents the attribution information contained in every json response. It holds a link to the
 * copyright and license information and a short copyright text.
 */
public class Attribution {
  @ApiModelProperty(notes = "URL to the copyright and license info", required = true)
  private String url;
  @ApiModelProperty(notes = "Copyright info about the used data", required = true)
  private String text;

  @java.lang.SuppressWarnings("all")
  public String getUrl() {
    return this.url;
  }

  @java.lang.SuppressWarnings("all")
  public String getText() {
    return this.text;
  }

  @java.lang.SuppressWarnings("all")
  public Attribution(final String url, final String text) {
    this.url = url;
    this.text = text;
  }
}
