package com.ibm.bug;

public class Bug {
	private String id;
	private String name;
	private  STATUS status ;
	private BugType type;
	private String location;
	private Priority priority;
	
	
	
	public Bug(String id, String name, STATUS status, BugType type, String location, Priority priority) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.type = type;
		this.location = location;
		this.priority = priority;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	public BugType getType() {
		return type;
	}
	public void setType(BugType type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	
	
	
}

