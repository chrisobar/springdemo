package com.example.swing_demo.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDISample {
 
	@Inject
	CdiObjectDAO cdiObjectDAO;

	public CdiObjectDAO getCdi() {
		return cdiObjectDAO;
	}

	public void CdiObjectDAO(CdiObjectDAO cdi) {
		this.cdiObjectDAO = cdi;
	}
	
} 
  