package com.notification.app;

import javax.servlet.Servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.coxautodev.graphql.tools.SchemaParser;
import com.notification.app.repository.UserNotificationRepository;
import com.notification.app.resolvers.Query;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLHttpServlet;

@SpringBootApplication
public class NotificationGraphQlApplication {
	
	@Autowired
	private UserNotificationRepository userNotificationRepository;

	public static void main(String[] args) {
		SpringApplication.run(NotificationGraphQlApplication.class, args);
	}
	
	
	@Bean
	public ServletRegistrationBean<Servlet> graphQLServlet() {
		return new ServletRegistrationBean<Servlet>(SimpleGraphQLHttpServlet.newBuilder(buildSchema(userNotificationRepository)).build(),"/graphql");
		
	}

	private GraphQLSchema buildSchema(UserNotificationRepository userRepo) {
		return SchemaParser
				.newParser()
				.file("schema.graphqls")
				.resolvers(new Query(userRepo))
				.build()
				.makeExecutableSchema();
	}

}
