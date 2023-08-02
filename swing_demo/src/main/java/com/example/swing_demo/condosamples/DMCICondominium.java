package com.example.swing_demo.condosamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DMCICondominium {
//	
//	public static void main(String[] args) {
//		ApplicationContext appContext = SpringApplication.run(DMCICondominium.class, args);
//		
//	}
	@Autowired
	@Qualifier("getAdmin")
	private DMCISupplier dmciSupplier;
	
	
	public int orderChairs(int orders, int measurements) {
		
		System.out.println(orders + ", " + measurements);
		int suppliedChairs = dmciSupplier.officeChairs(orders);
		return suppliedChairs;		
	}
	
	

}
