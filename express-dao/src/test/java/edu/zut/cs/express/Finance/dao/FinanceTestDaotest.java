package edu.zut.cs.express.Finance.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.Finance.daomain.FinanceTest;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;

public class FinanceTestDaotest extends GenericDaoTestCase<Long,FinanceTest,FinanceTestDao>{
	
	@Autowired
	FinanceTestDao financeTestDao;
	
	@Test
	public void test() {
		System.out.println("This is JunitTest!");
	}
	
}
