package com.example.swing_demo.cdi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SwingCdiApplication {
	
    private static Logger LOGGER = 
    		LoggerFactory.getLogger(SwingCdiApplication.class); 
    
	public static void main(String[] args) {
		 
//		ApplicationContext appContext = 
//				SpringApplication.run(SwingCdiApplication.class, args);
		try (AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(SwingCdiApplication.class)) {
        CDISample cdi = appContext.getBean(CDISample.class);
        LOGGER.info("{} dao--{}", cdi, cdi.getCdi());
		
		}
        
	}

}
