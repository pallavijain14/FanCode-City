package org.main.fancode.dto;

public class GeoDto {
	private String lat;
    private String lng;
    
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	@Override
	public String toString() {
		return "GeoDto [lat=" + lat + ", lng=" + lng + "]";
	}
    
    
}
