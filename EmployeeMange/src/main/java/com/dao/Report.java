package com.dao;

public class Report {

	private String Date;
	private String task;
	public Report(String date, String task) {
		super();

		Date = date;
		this.task = task;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	
	
	
	
	
}
