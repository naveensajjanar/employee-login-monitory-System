package com.dao;

class News 
{
private String topic;
private String description;


 News(String topic, String description) {

	this.topic = topic;
	this.description = description;
}
public String getTopic() {
	return topic;
}
public void setTopic(String topic) {
	this.topic = topic;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


}
