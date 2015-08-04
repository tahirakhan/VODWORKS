package com.vodworks.vo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Asset implements Serializable {

  private String skyGoUrl;

  private String url;

  private String reviewAuthor;

  private String id;
  private String cert;

  private ViewingWindow viewingWindow;

  private String headline;

  private List<CardImage> cardImages = new ArrayList<CardImage>();

  private List<Director> directors = new ArrayList<Director>();

  private String sum;

  private List<KeyArtImage> keyArtImages = new ArrayList<KeyArtImage>();

  private String synopsis;

  private String body;

  private List<Cast> cast = new ArrayList<Cast>();

  private String skyGoId;

  private String year;

  private Integer duration;

  private Integer rating;

  private String _class;

  private List<Video> videos = new ArrayList<Video>();

  private String lastUpdated;

  private List<String> genres = new ArrayList<String>();

  private String quote;

  private Map<String, Object> additionalProperties = new HashMap<String, Object>();


  public String getSkyGoUrl() {
    return skyGoUrl;
  }

  public void setSkyGoUrl(String skyGoUrl) {
    this.skyGoUrl = skyGoUrl;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getReviewAuthor() {
    return reviewAuthor;
  }

  public void setReviewAuthor(String reviewAuthor) {
    this.reviewAuthor = reviewAuthor;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCert() {
    return cert;
  }

  public void setCert(String cert) {
    this.cert = cert;
  }

  public ViewingWindow getViewingWindow() {
    return viewingWindow;
  }

  public void setViewingWindow(ViewingWindow viewingWindow) {
    this.viewingWindow = viewingWindow;
  }

  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }

  public List<CardImage> getCardImages() {
    return cardImages;
  }

  public void setCardImages(List<CardImage> cardImages) {
    this.cardImages = cardImages;
  }

  public List<Director> getDirectors() {
    return directors;
  }

  public void setDirectors(List<Director> directors) {
    this.directors = directors;
  }

  public String getSum() {
    return sum;
  }

  public void setSum(String sum) {
    this.sum = sum;
  }

  public List<KeyArtImage> getKeyArtImages() {
    return keyArtImages;
  }

  public void setKeyArtImages(List<KeyArtImage> keyArtImages) {
    this.keyArtImages = keyArtImages;
  }

  public String getSynopsis() {
    return synopsis;
  }

  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public List<Cast> getCast() {
    return cast;
  }

  public void setCast(List<Cast> cast) {
    this.cast = cast;
  }

  public String getSkyGoId() {
    return skyGoId;
  }

  public void setSkyGoId(String skyGoId) {
    this.skyGoId = skyGoId;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public String get_class() {
    return _class;
  }

  public void set_class(String _class) {
    this._class = _class;
  }

  public List<Video> getVideos() {
    return videos;
  }

  public void setVideos(List<Video> videos) {
    this.videos = videos;
  }

  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }

  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }
}
