package com.example.swing_demo.condosamples;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SwingDemoApplication {

	public static void main(String[] args) {
		
//		ApplicationContext appContext = SpringApplication.run(SwingDemoApplication.class, args);
		try (AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(SwingDemoApplication.class)) {
		DMCICondominium dmci = appContext.getBean(DMCICondominium.class); 
		int order = dmci.orderChairs(10, 500);
		System.out.println(order);
		
		}

	}

}
