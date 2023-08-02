package com.example.swing_demo.condosamples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class DMCICondominium {
//	
//	public static void main(String[] args) {
//		ApplicationContext appContext = SpringApplication.run(DMCICondominium.class, args);
//		
//	}
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	@Qualifier("getAdmin")
	private DMCISupplier dmciSupplier;
	
	
	public int orderChairs(int orders, int measurements) {
		
		System.out.println(orders + ", " + measurements);
		int suppliedChairs = dmciSupplier.officeChairs(orders);
		return suppliedChairs;		
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	
	
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}	

}
