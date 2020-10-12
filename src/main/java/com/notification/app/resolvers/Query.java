package com.notification.app.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.notification.app.entities.UserNotification;
import com.notification.app.repository.UserNotificationRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver{
	
	@Autowired
	private final UserNotificationRepository userNotificationRepository;
	
	public List<UserNotification> userNotification(){
		return userNotificationRepository.findAll();
	}
	
	public List<UserNotification> byUsername(String username){
		return userNotificationRepository.findByUsername(username);
	}
	
	
}
