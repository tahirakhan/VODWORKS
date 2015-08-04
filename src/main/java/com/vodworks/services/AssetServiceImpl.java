package com.vodworks.services;

import com.vodworks.vo.Asset;

import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Tahir on 8/5/2015.
 */

@Component
public class AssetServiceImpl implements  AssetService{

  private final String uri = "http://s3.amazonaws.com/vodassets/showcase.json";
  private RestTemplate restTemplate;
  public AssetServiceImpl(){
    restTemplate = new RestTemplate();
  }
  public List<Asset> fetchAssetsFromServer() {
    List<Asset> assetsList = new ArrayList<Asset>();
    try {

      restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
      Asset[] AssetsArray = restTemplate.getForObject(uri, Asset[].class);
      assetsList = new ArrayList<Asset>(
          Arrays.asList(AssetsArray));

    } catch (Exception e) {
      e.printStackTrace();
    }

    return assetsList;
  }

  public RestTemplate getRestTemplate() {
    return restTemplate;
  }

  public void setRestTemplate(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public String getUri() {
    return uri;
  }
}
