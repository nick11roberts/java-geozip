package javaGeozip;

public class LatLonPair {
  private Double latitude;
  private Double longitude;
  LatLonPair(){
    setLatitude(0.0);
    setLongitude(0.0);
  }
  LatLonPair(Double lat, Double lon){
    setLatitude(lat);
    setLongitude(lon);
  }
  public Double getLatitude(){
    return this.latitude;
  }
  public Double getLongitude(){
    return this.longitude;
  }
  public void setLatitude(Double lat){
    this.latitude = lat;
  }
  public void setLongitude(Double lon){
    this.longitude = lon;
  }
}
