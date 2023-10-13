package org.heigit.ohsome.ohsomeapi.output.groupby;

import io.swagger.annotations.ApiModelProperty;

/**
 * Abstract class used by the following groupByResult classes.
 *
 * <ul>
 * <li>{@link org.heigit.ohsome.ohsomeapi.output.groupby.GroupByResult GroupByResult}</li>
 * <li>{@link org.heigit.ohsome.ohsomeapi.output.ratio.RatioGroupByResult RatioGroupByResult}</li>
 * </ul>
 */
public abstract class GroupByObject {
  @ApiModelProperty(notes = "Object on which the results are grouped on", required = true)
  protected Object groupByObject;

  @java.lang.SuppressWarnings("all")
  public Object getGroupByObject() {
    return this.groupByObject;
  }

  @java.lang.SuppressWarnings("all")
  public GroupByObject(final Object groupByObject) {
    this.groupByObject = groupByObject;
  }
}
