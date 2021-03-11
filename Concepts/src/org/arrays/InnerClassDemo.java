package org.arrays;

public class InnerClassDemo {
	public static void main(String[] args) {
		// create array of 10 Account objects
		Account[] accounts = new Account[10];

	}
}

class Account {
	// private Address address; handle only 1 address
	private Address[] addresses; // handle multiple addresses --> this is only a reference; object not defined,
									// will initialise later
	private int number;

	public Account() {
		this.addresses = new Address[3]; // lazy initialisation--->we declare the object here
	}

	public Address[] getAddresses() {
		return addresses;
	}

	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private class Address {
		private String streetName;
	}

}
