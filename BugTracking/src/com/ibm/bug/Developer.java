package com.ibm.bug;

public class Developer extends Employee {
	
	private BugDevStatus bugdev;
	
	public Developer(String empName, String empId, String email, int number) {
		super(empName, empId, email, number);
		
	}
	public void setBugStatus(BugDevStatus bugdev) {
		System.out.println("The bug status is set to :" + this.bugdev);
	}
	
}
