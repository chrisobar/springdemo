package com.example.swing_demo.condosamples;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("getAdmin")
public class DMCIAdmin implements DMCISupplier{

//	@Override
	public int officeChairs(int chairStocks) {
		// TODO Auto-generated method stub
		return 5;
	}


}
