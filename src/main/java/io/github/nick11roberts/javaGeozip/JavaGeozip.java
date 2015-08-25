package io.github.nick11roberts.javaGeozip;

public class JavaGeozip {

	public static void main(String [ ] args){
		LatLonPair coords = new LatLonPair(-70.987, 167.5554);
		System.out.println(Geozip.validate(coords));
		System.out.println(Geozip.encode(coords, false, 8));
	}

}
