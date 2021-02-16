/**
 * @Date Feb 15, 2021
 * @Class User.java
 * @Author Nayeemul Islam
 * @Project spring-boot-kafka-consumer-example
 */
package com.nayeem.kafka.consumer.model;



/**
 * @author Nayeem
 *
 */

public class User {
	
    private String name;
    private String dept;
    private Long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    
    

    public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public User() {
    }

    public User(String name, String dept) {

        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dept='").append(dept).append('\'');
        sb.append(", salary='").append(salary).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
