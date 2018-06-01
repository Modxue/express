package edu.zut.cs.express.Finance.service;

import java.util.List;

import edu.zut.cs.express.Finance.daomain.Finance;
import edu.zut.cs.express.base.service.GenericManager;

public interface FinanceManager extends GenericManager<Finance,Long>{
	
	List<Finance> findbyIDnum(String idnum);
	
	List<Finance> findbyName(String name);
}
