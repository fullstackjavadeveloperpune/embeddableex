package com.fullstack.jpa;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String addressStreet;

	private String addressCity;

	private String addressState;

	private String addressCountry;

	private long addressPinCode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String addressStreet, String addressCity, String addressState, String addressCountry,
			long addressPinCode) {
		super();
		this.addressStreet = addressStreet;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressCountry = addressCountry;
		this.addressPinCode = addressPinCode;
	}

	@Override
	public String toString() {
		return "Address [addressStreet=" + addressStreet + ", addressCity=" + addressCity + ", addressState="
				+ addressState + ", addressCountry=" + addressCountry + ", addressPinCode=" + addressPinCode + "]";
	}

}
