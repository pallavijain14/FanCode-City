package org.main.fancode.dto;

public class AddressDto {
	  private GeoDto geo;

	public GeoDto getGeo() {
		return geo;
	}

	public void setGeo(GeoDto geo) {
		this.geo = geo;
	}

	@Override
	public String toString() {
		return "AddressDto [geo=" + geo + "]";
	}
	  
	  
}
