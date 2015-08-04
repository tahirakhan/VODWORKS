package com.vodworks.vo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Video implements Serializable {

  private String title;

  private List<Alternative> alternatives = new ArrayList<Alternative>();

  private String type;
  private String url;

  private Map<String, Object> additionalProperties = new HashMap<String, Object>();


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<Alternative> getAlternatives() {
    return alternatives;
  }

  public void setAlternatives(List<Alternative> alternatives) {
    this.alternatives = alternatives;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }
}
