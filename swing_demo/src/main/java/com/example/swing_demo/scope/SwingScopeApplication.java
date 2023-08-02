package com.example.swing_demo.scope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.swing_demo.scope.PersonDAO;

@SpringBootApplication
public class SwingScopeApplication {
	
    private static Logger LOGGER = 
    		LoggerFactory.getLogger(SwingScopeApplication.class); 
    
	public static void main(String[] args) {
		
		ApplicationContext appContext = 
				SpringApplication.run(SwingScopeApplication.class, args);
        PersonDAO personDao1 = 
        		appContext.getBean(PersonDAO.class);
        PersonDAO personDao2 = 
        		appContext.getBean(PersonDAO.class);		
        
        LOGGER.info("{}", personDao1); 
        LOGGER.info("{}", personDao1.getJdbcConn());
        
        LOGGER.info("{}", personDao2);
        LOGGER.info("{}", personDao1.getJdbcConn());
        LOGGER.info("{}", personDao1.getJdbcConn());
	}

}
