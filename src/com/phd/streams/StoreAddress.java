package com.phd.streams;

public class StoreAddress {

	private String streetAddress1;
	private String streetAddress2;
	private String streetAddress3;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String phone;

	public StoreAddress() {
	}

	public StoreAddress(String streetAddress1, String streetAddress2, String streetAddress3, String city, String state,
			String postalCode, String country, String phone) {
		this.streetAddress1 = streetAddress1;
		this.streetAddress2 = streetAddress2;
		this.streetAddress3 = streetAddress3;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.phone = phone;
	}

	public String getStreetAddress1() {
		return streetAddress1;
	}

	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	public String getStreetAddress3() {
		return streetAddress3;
	}

	public void setStreetAddress3(String streetAddress3) {
		this.streetAddress3 = streetAddress3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
