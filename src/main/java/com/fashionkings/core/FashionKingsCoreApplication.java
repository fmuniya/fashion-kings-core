package com.fashionkings.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FashionKingsCoreApplication {

	public static void main(String[] args) {
		//System.out.println("my application ran okay");
		ApplicationContext apc = SpringApplication.run(FashionKingsCoreApplication.class, args);
		//for (String name: apc.getBeanDefinitionNames())
		//	System.out.println(name);
	}

}
