package com.imran.embeddingObjects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AddressEmbd {
	
    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "AddressEmbd [city=" + city + ", country=" + country + "]";
	}
    
    

}
