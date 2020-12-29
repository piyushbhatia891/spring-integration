package com.example.integration.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class Controller {

	@Autowired
	private IGateway gateway;
	@GetMapping("transform")
	public ResponseEntity<String> getMessage(@RequestParam("query")String message) {
		gateway.processMessage(MessageBuilder.withPayload(message).build());
		return ResponseEntity.ok("Thanks");
	}

}
