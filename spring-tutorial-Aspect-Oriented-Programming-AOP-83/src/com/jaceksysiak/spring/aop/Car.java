package com.jaceksysiak.spring.aop;

import org.springframework.stereotype.Component;

@Component("car")
public class Car {
	
	public void start(){
		System.out.println("Car is starting ...");
	}

}
