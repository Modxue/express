package edu.zut.cs.express.Finance.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.Finance.daomain.FinanceTest;
import edu.zut.cs.express.base.service.GenericManagerTestCase;

public class FinanceTestManagerTest extends GenericManagerTestCase<Long,FinanceTest,FinanceTestManager>{

	public FinanceTestManagerTest() {
		super(FinanceTest.class);
		// TODO Auto-generated constructor stub
	}
	
	FinanceTestManager financeTestManager;
	@Autowired
	public void setFinanceTestManager(FinanceTestManager financeTestManager) {
		this.financeTestManager = financeTestManager;
		this.manager = this.financeTestManager;
	}
	
	@Override
	public void setUp()throws Exception{
		FinanceTest financeTest = new FinanceTest();
		financeTest.setName("测试");
		financeTest.setMoney(5000);
		this.entity = this.manager.save(financeTest);
	}
	
	
	@Test
	public void FindAlltest() {
		//List<FinanceTest> result = this.financeTestManager.FindAll();
		
		System.out.println("");
	}

}
