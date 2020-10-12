package com.notification.app.repository;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.notification.app.entities.UserNotification;

@Repository
public interface UserNotificationRepository extends MongoRepository<UserNotification, ObjectId>{
	
	List<UserNotification> findByUsername(String username);
	
	
}
