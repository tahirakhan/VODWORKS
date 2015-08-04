import com.vodworks.services.AssetServiceImpl;
import com.vodworks.vo.Asset;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Tahir on 8/5/2015.
 */


public class AssetServiceImplTest {

  @Test
  public void testOffetchAssetsFromServerShouldReturnAListOfAssets() throws Exception {

    // given

    AssetServiceImpl testClass = new AssetServiceImpl();

    // - return data
    Asset[] listAsset =new Asset[2];
    Asset asset1 = new Asset();
    asset1.setHeadline("Headline1");
    Asset asset2 = new Asset();
    asset2.setHeadline("Headline2");
    listAsset[0] = asset1;
    listAsset[1] = asset2;



    // - mock AccessControlService
    RestTemplate api = mock(RestTemplate.class);
    RestTemplate restTemplate = new RestTemplate();
    when(api.getMessageConverters()).thenReturn(restTemplate.getMessageConverters());
    when(api.getForObject(testClass.getUri(), Asset[].class)).thenReturn(listAsset);

    // - API
    testClass.setRestTemplate(api);

    // when
    List<Asset> returnVal = testClass.fetchAssetsFromServer();

    // then
    assertThat(returnVal, is(not(nullValue())));
    assertThat(returnVal.size(), is(equalTo(2)));
    assertThat(returnVal.get(0).getHeadline(), is(equalTo("Headline1")));

  }
}
