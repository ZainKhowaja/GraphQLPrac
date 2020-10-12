package com.notification.app.controller;



import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import graphql.ExecutionInput;
import graphql.GraphQL;

public class NotificationRestendpoint {
	
	
	private static final Logger logger = LoggerFactory.getLogger(NotificationRestendpoint.class);
//
//	@Autowired
//	private GraphQL graphQl;
	
//	@RequestMapping(value = "graphql", method = RequestMethod.POST)
//	public void addCourseUpdateNotification(@RequestBody Map<String, Object> request){
//		graphQl.executeAsync(ExecutionInput.newExecutionInput(request.get("query")+"").operationName(request.get("operationName")+"").build());
//	}
	
}
