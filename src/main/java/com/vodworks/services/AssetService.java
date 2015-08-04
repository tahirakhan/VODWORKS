package com.vodworks.services;

import com.vodworks.vo.Asset;

import java.util.List;

/**
 * Created by Tahir on 8/5/2015.
 */
public interface AssetService {


  /*
  This Method will fetch the list of all assets from the url http://s3.amazonaws.com/vodassets/showcase.json
   */
  public List<Asset> fetchAssetsFromServer();
}
