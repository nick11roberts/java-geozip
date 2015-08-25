package io.github.nick11roberts.javaGeozip;

import java.lang.String;

public class Geozip {

  private static String latShiftedString;
  private static String lonShiftedString;

  public static Long encode(LatLonPair coordinates, Boolean validate, Integer precision){
    Long zip = 0L;
    Double latShifted, lonShifted;
    latShifted = coordinates.getLatitude() + 90.0;
    lonShifted = coordinates.getLongitude() + 180.0;
    latShiftedString = String.valueOf(latShifted);
    lonShiftedString = String.valueOf(lonShifted);

    return zip;
  }

  public static LatLonPair decode(Long zip){
    LatLonPair coordinates = new LatLonPair();
    return coordinates;
  }

  public static Boolean validate(LatLonPair coordinates){
    Boolean proper = false;
    if(coordinates.getLatitude() >= -90.0 && coordinates.getLatitude() <= 90.00 &&
    		coordinates.getLongitude() >= -180.0 && coordinates.getLongitude() <= 180.0){
          proper = true;
    }
    return proper;
  }

}
