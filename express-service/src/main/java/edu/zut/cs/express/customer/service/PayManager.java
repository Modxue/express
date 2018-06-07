package edu.zut.cs.express.customer.service;

import java.util.List;

import edu.zut.cs.express.base.service.GenericManager;
import edu.zut.cs.express.customer.domain.Pay;

public interface PayManager extends GenericManager<Pay, Long>{
	List<Pay> findbyIDnum(String idnum);
	List<Pay> findByuser_name(String username);
}
