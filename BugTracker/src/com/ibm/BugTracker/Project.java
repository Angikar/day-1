package com.ibm.BugTracker;

public class Project {
	
	private String projectName;
	private int projectId;
	private int developerId;
	private int testerId;
	private int managerId;
	
	
	public Project(String projectName, int projectId, int developerId, int testerId, int managerId) {
		setProjectName(projectName);
		setProjectId(projectId);
		setDeveloperId(developerId);
		setTesterId(testerId);
		setManagerId(managerId);
		
		
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}
	public int getTesterId() {
		return testerId;
	}
	public void setTesterId(int testerId) {
		this.testerId = testerId;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
}
