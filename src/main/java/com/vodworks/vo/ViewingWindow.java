package com.vodworks.vo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ViewingWindow implements Serializable {

  private String title;

  private String startDate;

  private String wayToWatch;

  private String endDate;

  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getWayToWatch() {
    return wayToWatch;
  }

  public void setWayToWatch(String wayToWatch) {
    this.wayToWatch = wayToWatch;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
