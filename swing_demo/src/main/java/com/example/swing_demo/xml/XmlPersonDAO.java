package com.example.swing_demo.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@ComponentScan
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class XmlPersonDAO {


	public XmlJdbcConnection xmlJdbcConnection;

	public XmlJdbcConnection getxmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setxmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
		this.xmlJdbcConnection = jdbcConnection;
	}
	
}
