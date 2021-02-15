/**
 * @Date Feb 15, 2021
 * @Class User.java
 * @Author Nayeemul Islam
 * @Project spring-boot-kafka-producer
 */
package com.nayeem.kafka.producer.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Nayeem
 *
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
    private String name;
    private String dept;
    private Long salary;

}
