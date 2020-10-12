package com.notification.app.entities;

public enum Type {

	RSVP_ENROLLMENT, CUSTOM, UPDATE_COURSE, MONTHLY_PROGRESS_REPORT;

	String regex() {
		String regex = "";
		for (Type type : values())
			regex += type.toString() + "|";
		return regex.substring(0, regex.length() - 1);
	}

}
