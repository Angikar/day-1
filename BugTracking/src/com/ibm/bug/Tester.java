package com.ibm.bug;

import java.util.Date;

public class Tester extends Employee {
	public Tester(String empName, String empId, String email, int number) {
		super(empName, empId, email, number);
		
	}
	private int logVersion;
	private Date submtOn;
	public int getLogVersion() {
		return logVersion;
	}
	public void setLogVersion(int logVersion) {
		this.logVersion = logVersion;
	}
	public Date getSubmtOn() {
		return submtOn;
	}
	public void setSubmtOn(Date submtOn) {
		this.submtOn = submtOn;
	}
	public void log() {
		System.out.println("Log report of new Bug is created");
	}
	
	
}
