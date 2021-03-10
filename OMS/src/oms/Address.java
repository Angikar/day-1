package oms;

public class Address {
	private String street;
	private String city;
	private String state;
	private int PinCode;

	public Address(String street, String city, String state, int pinCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		PinCode = pinCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public int getPinCode() {
		return PinCode;
	}

	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}

}
