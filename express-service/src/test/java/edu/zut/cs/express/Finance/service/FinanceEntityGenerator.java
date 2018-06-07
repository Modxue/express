package edu.zut.cs.express.Finance.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.Finance.daomain.Finance;
import edu.zut.cs.express.base.service.GenericGenerator;

public class FinanceEntityGenerator extends GenericGenerator{
	
	List<Finance> financeList;
	
	FinanceManager financeManager;
	
	@Autowired
	public void setFinanceManager(FinanceManager financeManager) {
		this.financeManager = financeManager;
	}
	
	
	@Test
	public void test() {
		this.financeManager.save(financeList);
		List<Finance> result = this.financeManager.findAll();
		if(logger.isInfoEnabled()) {
			logger.info("test() - List<Student> result=" + result);
		}
	}
}
