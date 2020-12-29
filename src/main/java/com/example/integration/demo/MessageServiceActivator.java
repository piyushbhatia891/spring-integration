package com.example.integration.demo;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class MessageServiceActivator {

	@ServiceActivator(inputChannel = "transformerOutputChannel")
	public void getMessage(String cargoMessage) {
		System.out.println(cargoMessage);
	}

}