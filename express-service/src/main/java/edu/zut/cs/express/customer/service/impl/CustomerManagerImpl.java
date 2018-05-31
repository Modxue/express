package edu.zut.cs.express.customer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.zut.cs.express.base.service.impl.GenericManagerImpl;
import edu.zut.cs.express.customer.domain.Customer;
import edu.zut.cs.express.customer.service.CustomerManager;

@Component
public class CustomerManagerImpl extends GenericManagerImpl<Customer,Long> implements CustomerManager{

	@Override
	public List<Customer> findByPostcode(String postcode) {
		List<Customer> result = new ArrayList<Customer>();
		for (int i = 0; i < 10; i++) {
			Customer u = new Customer();
			result.add(u);
		}
		return result;
	}
	

}
