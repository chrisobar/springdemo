package com.example.swing_demo.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
//@Configuration
//@ComponentScan
public class SwingXMLContext {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SwingXMLContext.class);

	public static void main(String[] args) {
		
//		ApplicationContext appContext = SpringApplication.run(SwingDemoApplication.class, args);
		try (ClassPathXmlApplicationContext appContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
		LOGGER.info("Beans Loaded -> {}", (Object)appContext.getBeanDefinitionNames());
		XmlPersonDAO person = appContext.getBean(XmlPersonDAO.class);
//		System.out.println(person);
//		System.out.println(person.getxmlJdbcConnection());
//		
		LOGGER.info("{} {}", person, person.getxmlJdbcConnection());
		appContext.close();
		}

	}

}
