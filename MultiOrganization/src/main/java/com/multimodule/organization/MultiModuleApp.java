package com.multimodule.organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.*"})
public class MultiModuleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MultiModuleApp.class,args);
	}

}
