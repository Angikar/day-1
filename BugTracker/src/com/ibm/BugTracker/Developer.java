package com.ibm.BugTracker;

public class Developer extends Employee {
	public Developer(int id, String name) {
		setId(id);
		setName(name);
	}

	void setBugStatus(Bug bug, STATUS status) {
		bug.setStatus(status);
		System.out.println("After development ,the bug status now is :" + status);
	}

	void assignToTester(Bug bug, int testerId) {
		bug.setTesterId(testerId);
		bug.setStatus(STATUS.PENDING_RETEST);
		System.out.println("The bug is assigned to the tester with id , " + bug.getTesterId());
	}

}
