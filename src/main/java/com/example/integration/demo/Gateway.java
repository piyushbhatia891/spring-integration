package com.example.integration.demo;

import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface Gateway {
	@org.springframework.integration.annotation.Gateway(requestChannel = "requestChannel")
	String echo(String message);

}