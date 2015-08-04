package com.vodworks.utils;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Tahir on 8/5/2015.
 */
public class DateUtils {

  /*
  Following method helps get the difference between two dates.
   */
  public static long getDifferenceInGivenUnit(Date date1, Date date2, TimeUnit timeUnit) {
    long differenceInMillies = date2.getTime() - date1.getTime();
    return timeUnit.convert(differenceInMillies, TimeUnit.MILLISECONDS);
  }
}
