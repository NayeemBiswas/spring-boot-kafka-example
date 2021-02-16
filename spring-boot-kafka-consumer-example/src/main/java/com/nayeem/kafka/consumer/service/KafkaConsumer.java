/**
 * @Date Feb 15, 2021
 * @Class KafkaConsumer.java
 * @Author Nayeemul Islam
 * @Project spring-boot-kafka-consumer-example
 */
package com.nayeem.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.nayeem.kafka.consumer.model.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "Nayeem", group = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}
	
	public User user;
	

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@KafkaListener(topics = "Kafka_Example", group = "group_json", containerFactory = "userKafkaListenerFactory")
	public User consumeJson(User user) {
		System.out.println("Consumed JSON Message: " + user);
		setUser(user);
		return user;
	}
}
