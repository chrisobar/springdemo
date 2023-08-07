package com.example.swing_demo.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDISample {
 
	@Autowired
	CdiObjectDAO cdiObjectDAO;

	public CdiObjectDAO getCdi() {
		return cdiObjectDAO;
	}

	public void CdiObjectDAO(CdiObjectDAO cdi) {
		this.cdiObjectDAO = cdi;
	}
	
} 
  