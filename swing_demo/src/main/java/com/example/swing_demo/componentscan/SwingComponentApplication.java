package com.example.swing_demo.componentscan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.swing_demo.componentscan")
public class SwingComponentApplication {
	
    private static Logger LOGGER = 
    		LoggerFactory.getLogger(SwingComponentApplication.class); 
    
	public static void main(String[] args) {
		
		ApplicationContext appContext = 
				SpringApplication.run(SwingComponentApplication.class, args);
        ComponentDAO componentDao1 = 
        		appContext.getBean(ComponentDAO.class);
        ComponentDAO componentDao2 = 
        		appContext.getBean(ComponentDAO.class);		
        
        LOGGER.info("{}", componentDao1); 
        LOGGER.info("{}", componentDao1.getJdbcConn());
        
        LOGGER.info("{}", componentDao2);
        LOGGER.info("{}", componentDao1.getJdbcConn());
        LOGGER.info("{}", componentDao1.getJdbcConn());
	}

}
