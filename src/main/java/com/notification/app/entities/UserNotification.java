package com.notification.app.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;


@Document(collection = "UserNotification")
@Data
public class UserNotification implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;
	
	@Field(name = "notificationId")
	@DBRef
	private Notification notificationId;

	@Indexed(direction = IndexDirection.DESCENDING)
	private Date eventDate;

	private String title;

	private String desc;
	
	private String icon;

	private String username;

	private Boolean deleted;

	private Boolean read;
	
	private Map<Object, Object> additionalInfo;

	private Type type;
	
}
