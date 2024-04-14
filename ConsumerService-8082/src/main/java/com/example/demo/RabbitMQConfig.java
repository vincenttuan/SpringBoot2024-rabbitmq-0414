package com.example.demo;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
	
	@Bean
	FanoutExchange myExchange() {
		return new FanoutExchange("MyExchange");
	}
	
	@Bean
	Queue myQueue() {
		return new Queue("MyQueue", true); // 是否持久化
	}
	
	@Bean
	Binding bindingMyQueue(Queue myQueue, FanoutExchange myExchange) {
		return BindingBuilder.bind(myQueue).to(myExchange);
	} 
}
