package edu.zut.cs.express.Finance.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.Finance.daomain.Finance;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;

public class FinanceDaotest extends GenericDaoTestCase<Long,Finance,FinanceDao>{
	
	@Autowired
	FinanceDao financeDao;
	
	@Test
	public void test() {
		System.out.println("This is JunitTest!");
	}
	
}
