package com.dao;

class Meetings {

	private String time;
	private String description;
	
	public Meetings(String time, String description) {

		this.time = time;
		this.description = description;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
		
	
}
