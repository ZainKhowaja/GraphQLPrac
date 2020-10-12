package com.notification.app.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Notification")
public class Notification implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;

	private String name;

	private Type type;

	private String title;

	private String desc;

	private String icon;

	private Boolean active;

	private Boolean onEmail;

	private Boolean onNotification;

	private Date createdAt;
	
	private Date updatedDate;
	
	private Date startDate;
	
	private Date endDate;
	
	private List<Map<Object, Object>> additionalInfo;
	
	private Map<String, List<Map<String, Object>>> condition;

	
	@PersistenceConstructor
	public Notification(ObjectId id, String name, Type type, String title, String desc, String icon, Boolean active,
			Boolean onEmail, Boolean onNotification, Date createdAt, Date updatedDate, Date startDate, Date endDate,
			List<Map<Object, Object>> additionalInfo, Map<String, List<Map<String, Object>>> condition) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.title = title;
		this.desc = desc;
		this.icon = icon;
		this.active = active;
		this.onEmail = onEmail;
		this.onNotification = onNotification;
		this.createdAt = createdAt;
		this.updatedDate = updatedDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.additionalInfo = additionalInfo;
		this.condition = condition;
	}

	public Notification() {}
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return (type);
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Boolean getOnEmail() {
		return onEmail;
	}

	public void setOnEmail(Boolean onEmail) {
		this.onEmail = onEmail;
	}

	public Boolean getOnNotification() {
		return onNotification;
	}

	public void setOnNotification(Boolean onNotification) {
		this.onNotification = onNotification;
	}

	public List<Map<Object, Object>> getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(List<Map<Object, Object>> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Map<String, List<Map<String, Object>>> getCondition() {
		return condition;
	}

	public void setCondition(Map<String, List<Map<String, Object>>> condition) {
		this.condition = condition;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
}
