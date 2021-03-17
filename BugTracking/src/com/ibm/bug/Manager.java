package com.ibm.bug;

public class Manager extends Employee {
	
	 Acknowledge ack;
	 //STATUS stat;

	public Manager(String empName, String empId, String email, int number) {
		super(empName, empId, email, number);
		
	}
	public void acknowledgeReport() {
		System.out.println(Acknowledge.APPROVED);
		System.out.println("Receievd and acknowledged ");
	}
	public void mailToStakeHolders() {
		System.out.println("Sending mail to stakeholders");
	}
	public void assignBug(STATUS stat) {
		if(stat == STATUS.NEW) {
			System.out.println("New Bug is found");
		}else if(stat == STATUS.ASSIGNED) {
			System.out.println("");
		}
	}
}
