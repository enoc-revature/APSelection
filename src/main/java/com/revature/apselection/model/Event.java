package com.revature.apselection.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Event {
	@Column(name = "eventName")
	private String eventName;

	@Column(name = "eventLocation")
	private String eventLocation;
	
	@Column(name = "eventDateTime")
	private String eventDateTime;

	@Column(name = "eventNumericTime")
	private String eventNumericTime;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public String getEventDateTime() {
		return eventDateTime;
	}

	public void setEventDateTime(String eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	public String getEventNumericTime() {
		return eventNumericTime;
	}

	public void setEventNumericTime(String eventNumericTime) {
		this.eventNumericTime = eventNumericTime;
	}

	public Event(String eventName, String eventLocation, String eventDateTime, String eventNumericTime) {
		super();
		this.eventName = eventName;
		this.eventLocation = eventLocation;
		this.eventDateTime = eventDateTime;
		this.eventNumericTime = eventNumericTime;
	}

	public Event() {
		super();
	}

	@Override
	public String toString() {
		return "Event [eventName=" + eventName + ", eventLocation=" + eventLocation + ", eventDateTime=" + eventDateTime
				+ ", eventNumericTime=" + eventNumericTime + "]";
	}

	
}
