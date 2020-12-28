package com.example.integration.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.jms.Jms;
import javax.jms.ConnectionFactory;

@Configuration
@ImportResource("classpath:/xmls/queue.xml")
public class Inbound {

	@Bean
	public IntegrationFlow inboundFlow() {
		return IntegrationFlows.from(Jms
				.inboundGateway(connectionFactory)
				.destination("amq.outbound"))
				.transform((String s) -> s.toUpperCase())
				.get();
	}

	@Autowired
	private ConnectionFactory connectionFactory;
}