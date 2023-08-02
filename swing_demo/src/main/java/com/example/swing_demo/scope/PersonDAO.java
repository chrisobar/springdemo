package com.example.swing_demo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {

	@Autowired
	public JdbcConnection jdbcConnection;

	public JdbcConnection getJdbcConn() {
		return jdbcConnection;
	}

	public void setJdbcConn(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
}
