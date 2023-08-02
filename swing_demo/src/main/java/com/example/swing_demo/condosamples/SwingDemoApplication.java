package com.example.swing_demo.condosamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SwingDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext appContext = SpringApplication.run(SwingDemoApplication.class, args);
		DMCICondominium dmci = appContext.getBean(DMCICondominium.class);
		int order = dmci.orderChairs(10, 500);
		System.out.println(order);
	}

}
