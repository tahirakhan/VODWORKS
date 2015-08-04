package com.vodworks.action;

import com.vodworks.vo.Asset;

import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tahir on 8/5/2015.
 */
public class Controller {

  public static void main(String args[]) {

    final String uri = "http://s3.amazonaws.com/vodassets/showcase.json";

    try {
      RestTemplate restTemplate = new RestTemplate();
      restTemplate.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
      Asset[] AssetsArray = new RestTemplate().getForObject(uri, Asset[].class);
      List<Asset> controlsList = new ArrayList<Asset>(
          Arrays.asList(AssetsArray));

      System.out.println(controlsList.size());

      for(Asset asset:controlsList){
        System.out.println(asset.getHeadline());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
