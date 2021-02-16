/**
 * @Date Feb 16, 2021
 * @Class UserController.java
 * @Author Nayeemul Islam
 * @Project spring-boot-kafka-consumer-example
 */
package com.nayeem.kafka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nayeem.kafka.consumer.model.User;
import com.nayeem.kafka.consumer.service.KafkaConsumer;

/**
 * @author Nayeem
 *
 */

@RestController
@RequestMapping("consumer")
public class UserController {
	User u;
	
	@Autowired
	private KafkaConsumer consumer;
	
   @PostMapping("/user")
//	@KafkaListener(topics = "Kafka_Example", group = "group_json", containerFactory = "userKafkaListenerFactory")
    public User post() {
//		System.out.println("Controller JSON Message: " + user);

        return consumer.consumeJson(consumer.getUser());
        
//        https://medium.com/better-programming/kafka-vs-rabbitmq-why-use-kafka-8401b2863b8b
    }

}
