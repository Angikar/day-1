package com.ibm.BugTracker;

public class Employee {
	private int id;
	private String name;
	private String mail;
	private int phoneNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void sendBugReport(Bug bug ,Developer dev, Tester test, Manager man, int bid , String devName ,String testName , String manName) {
		bug.setBugId(bid);
		dev.setName(devName);
		test.setName(testName);
		man.setName(manName);
		System.out.println("To Manager:" + man.getId() + ",Bug " + bug.getBugId() + " is assigned by " + dev.getName() + " to tester, " + test.getName());
	}
}
