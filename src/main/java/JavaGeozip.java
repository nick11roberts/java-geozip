package javaGeozip;

public class JavaGeozip {
	
	public static void main(String [ ] args){
		LatLonPair coords = new LatLonPair(-90.987, 167.5554);
		System.out.println(Geozip.validate(coords));
	}

}
