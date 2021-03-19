package com.ibm.BugTracker;

public class Tester extends Employee {
	public Tester(int id, String name) {
		setId(id);
		setName(name);
	}

	public void addBug(Bug bug, int testerID, String name, PRIORITY priority, TYPE type, STATUS status, String location, String buildVersion, SEVERITY severity) {
		bug.setTesterId(testerID);
		bug.setName(name);
		bug.setPriority(priority);
		bug.setType(type);
		bug.setStatus(status);
		bug.setLocation(location);
		bug.setBuildVersion(buildVersion);
		bug.setSeverity(severity);
	}
	
	public void setBugStatus(Bug bug, STATUS status) {
		bug.setStatus(status);
		System.out.println("Testing in progress , status is :" + status);
	}
	

	@Override
	public String toString() {
		return "Tester [getId()=" + getId() + ", getName()=" + getName() + ", getMail()=" + getMail()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
