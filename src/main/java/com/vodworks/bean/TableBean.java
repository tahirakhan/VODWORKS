package com.vodworks.bean;

import com.vodworks.services.AssetService;
import com.vodworks.services.AssetServiceImpl;
import com.vodworks.utils.DateUtils;
import com.vodworks.vo.Asset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.faces.bean.ManagedBean;

/**
 * Created by Tahir on 8/5/2015.
 */
@ManagedBean(name = "tableBean")
public class TableBean implements Serializable {


  AssetService assetService = new AssetServiceImpl();

  private List<Asset> assetsList;
  private Date lastUpdated; //Keep track of date when the list was last updated.
  private long frequency = 8; // this will always be in hours


  public List<Asset> getAssetsList() {
    Date currentDate = new Date(System.currentTimeMillis());
    if(assetsList == null){
      lastUpdated = currentDate;
      assetsList = assetService.fetchAssetsFromServer();
    }
    else{
      if(DateUtils.getDifferenceInGivenUnit(lastUpdated,currentDate, TimeUnit.HOURS)> frequency){
        lastUpdated = currentDate;
        assetsList = assetService.fetchAssetsFromServer();
      }
    }

    return assetsList;
  }



  public void setAssetsList(List<Asset> assetsList) {
    this.assetsList = assetsList;
  }

  public Date getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public long getFrequency() {
    return frequency;
  }

  public void setFrequency(long frequency) {
    this.frequency = frequency;
  }
}
