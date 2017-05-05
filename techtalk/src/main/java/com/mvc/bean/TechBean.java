package com.mvc.bean;

public class TechBean {
	private String date;
	 private String title;
	 private String description;
	 private String presentor;
	 private String id;
	public String getId() {
		return id;
	}
	public void setId(String sid) {
		this.id = sid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPresentor() {
		return presentor;
	}
	public void setPresentor(String presentor) {
		this.presentor = presentor;
	}
	
}
