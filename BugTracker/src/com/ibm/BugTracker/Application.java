package com.ibm.BugTracker;

import java.util.Date;

public class Application {
	public static void main(String[] args) {

		Manager manager = new Manager(101, "Srikant M");
		manager.setMail("srikant.m@gmail");
		manager.setPhoneNumber(76532201);

		Developer developer = new Developer(102, "Manish Roy");
		developer.setMail("mroy@gmail");
		developer.setPhoneNumber(90003487);

		Tester tester = new Tester(3, "Ankita Kaula");
		tester.setMail("ankita@gmail");
		tester.setPhoneNumber(95673212);

		Project project = new Project("BugTrackingSystem", 21, developer.getId(), tester.getId(), manager.getId());

		Bug bug = new Bug(5, project.getProjectId(), new Date());
		
		System.out.println(bug);

		tester.addBug(bug, tester.getId(), "index mismatch", PRIORITY.HIGH, TYPE.FUNCTIONAL, STATUS.NEW, "ARRAYLIST",
				"v2.6", SEVERITY.SEVERE);
		// System.out.println(tester);
		manager.assignBug(bug, developer.getId());

		developer.setBugStatus(bug, STATUS.FIXED);

		developer.assignToTester(bug, tester.getId());
		manager.sendBugReport(bug, developer, tester, manager, bug.getBugId(), developer.getName(), tester.getName(),
				manager.getName());
		
		tester.setBugStatus(bug, STATUS.RETEST);
		
		tester.setBugStatus(bug, STATUS.VERIFIED);
		
		manager.acknowledgeReport();
		
		manager.mailToStakeHolder();
		
		
		
		

	}
}
