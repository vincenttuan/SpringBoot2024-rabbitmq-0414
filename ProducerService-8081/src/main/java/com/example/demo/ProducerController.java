package com.example.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProducerController {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@GetMapping("/send")
	public String send(@RequestParam String message) {
		String exchangeName = "MyExchange";
		rabbitTemplate.convertAndSend(exchangeName, null, message);
		return "已發送: " + message + " 到 " + exchangeName;
	}
	
}
