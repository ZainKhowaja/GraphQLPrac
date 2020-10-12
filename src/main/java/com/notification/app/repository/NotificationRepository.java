package com.notification.app.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.notification.app.entities.Notification;
import com.notification.app.entities.Type;


@Repository
public interface NotificationRepository extends MongoRepository<Notification, ObjectId>{
	
	Optional<Notification> findFirstByTypeAndActiveTrue(Type type);
	
	@Query(value = "{ 'condition.additionalInfo.courseGuid' : ?0 }")
	Optional<Notification> findUpdateCourseByCourseGuid(String courseGuid);
	
	@Aggregation(pipeline = {
				"{ $match: { type:'UPDATE_COURSE'} }", 
				"{ $limit: 1}", 
				"{ $project: {  notification:'$$ROOT',  index:{ $indexOfArray:['$$ROOT.additionalInfo.courseGuid',?0] }, _id:0 } }"
			})
	
	Boolean existsByTypeAndName(Type type, String name);

}