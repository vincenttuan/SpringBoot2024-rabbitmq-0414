package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
	
	// 監聽 MyQueue
	@RabbitListener(queues = "MyQueue")
	public void consumeMessageFromQueue(String message) {
		System.out.println("Consume a message: " + message);
	}
	
}
