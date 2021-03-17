package com.ibm.BugTracker;

import java.util.Date;

public class Bug {
	private int bugId;
	private int projectId;
	private int developerId;
	private int testerId;
	private int managerId;
	private String name;
	private Date submittedOn;
	private PRIORITY priority;
	private TYPE type;
	private STATUS status;
	private String location;
	private String buildVersion;
	private SEVERITY severity;
	

	public Bug(int bugId, int projectId, Date submittedOn) {
		setBugId(bugId);
		setProjectId(projectId);
		setSubmittedOn(submittedOn);
	}

	public int getBugId() {
		return bugId;
	}

	public void setBugId(int bugId) {
		this.bugId = bugId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getSubmittedOn() {
		return submittedOn;
	}

	public void setSubmittedOn(Date submittedOn) {
		this.submittedOn = submittedOn;
	}

	public PRIORITY getPriority() {
		return priority;
	}

	public void setPriority(PRIORITY priority) {
		this.priority = priority;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public SEVERITY getSeverity() {
		return severity;
	}

	public void setSeverity(SEVERITY severity) {
		this.severity = severity;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Bug [bugId=" + bugId + ", projectId=" + projectId + ", developerId=" + developerId + ", testerId="
				+ testerId + ", managerId=" + managerId + ", name=" + name + ", submittedOn=" + submittedOn
				+ ", priority=" + priority + ", type=" + type + ", status=" + status + ", location=" + location
				+ ", buildVersion=" + buildVersion + ", severity=" + severity + "]";
	}

}
