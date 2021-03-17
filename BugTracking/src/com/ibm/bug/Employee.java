package com.ibm.bug;

public class Employee {
	private String empName;
	private String empId;
	private String email;
	private int number;
	Project project;
	public Employee(String empName, String empId, String email, int number) {
		this.empName = empName;
		this.empId = empId;
		this.email = email;
		this.number = number;
	}
	
	public void sendBugReport() {
		System.out.println("The Bug Report is sent");
	}
	
	public STATUS displayStatus(STATUS s) {
		
		return s;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
}
