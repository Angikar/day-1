package com.ibm.BugTracker;

public class Manager extends Employee {
	public Manager(int id, String name) {
		setId(id);
		setName(name);
	}
	
	public void assignBug(Bug bug, int developerID) {
		bug.setDeveloperId(developerID);
		bug.setStatus(STATUS.ASSIGNED);
	}
	
	public void acknowledgeReport() {
		System.out.println("REPORT Acknowledged! ");
	}
	
	public void mailToStakeHolder() {
		System.out.println("Bug is handled!");
	}
	public String checkStatus(Bug bug1) {
		if(bug1.getStatus()==STATUS.VERIFIED) {
			return "Bug is verified";
		}else {
			return "Still needs correction";
		}
	}
}
