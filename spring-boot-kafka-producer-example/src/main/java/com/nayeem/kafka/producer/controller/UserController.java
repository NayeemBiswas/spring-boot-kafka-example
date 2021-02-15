/**
 * @Date Feb 15, 2021
 * @Class UserController.java
 * @Author Nayeemul Islam
 * @Project spring-boot-kafka-producer
 */
package com.nayeem.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nayeem.kafka.producer.model.User;

/**
 * @author Nayeem
 *
 */

@RestController
@RequestMapping("producer")
public class UserController {
	
    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    private static final String TOPIC = "Kafka_Example";

    @GetMapping("/publish/{name}/{dept}/{salary}")
    public String post(@PathVariable("name") String name, @PathVariable("dept") String dept, @PathVariable("salary") Long salary) {

        kafkaTemplate.send(TOPIC, new User(name, dept, salary));

        return "Published successfully";
    }
	

}
