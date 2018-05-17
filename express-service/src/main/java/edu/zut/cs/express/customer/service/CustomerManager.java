package edu.zut.cs.express.customer.service;

import java.util.List;

import edu.zut.cs.express.base.service.GenericManager;
import edu.zut.cs.express.customer.domain.Customer;

public interface CustomerManager extends GenericManager<Customer,Long> {
	
	List<Customer> findByPostcode(String postcode);
}
