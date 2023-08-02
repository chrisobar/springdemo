package com.example.swing_demo.cdi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SwingCdiApplication {
	
    private static Logger LOGGER = 
    		LoggerFactory.getLogger(SwingCdiApplication.class); 
    
	public static void main(String[] args) {
		 
		ApplicationContext appContext = 
				SpringApplication.run(SwingCdiApplication.class, args);
        CDISample cdi = appContext.getBean(CDISample.class);
        LOGGER.info("{} dao--{}", cdi, cdi.getCdi());
        
	}

}
