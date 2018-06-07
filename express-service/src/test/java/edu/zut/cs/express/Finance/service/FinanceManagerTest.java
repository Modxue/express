package edu.zut.cs.express.Finance.service;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.Finance.daomain.Finance;
import edu.zut.cs.express.base.service.GenericManagerTestCase;

public class FinanceManagerTest extends GenericManagerTestCase<Long,Finance,FinanceManager>{

	
	
	FinanceManager financeManager;
	
	@Autowired
	public void setFinanceTestManager(FinanceManager financeManager) {
		this.financeManager = financeManager;
		this.manager = this.financeManager;
	}
	
	public FinanceManagerTest() {
		super(Finance.class);
	}
	
	@Before
	public void setUp()throws Exception{
		Finance finance = new Finance();
		finance.setName("薛二伟");
		finance.setAge(21);
		finance.setMoney(5000);
		finance.setSex("男");
		finance.setIDnum("201820");
		this.entity = this.manager.save(finance);
	}
	
	
	@Test
	public void testFindByname() {
		
		List<Finance> result = this.financeManager.findbyName("薛");
	//	assertNotNull(result);
	//	assertEquals(1, result.size());
	//	assertEquals("薛二伟", result.get(0).getName());
		System.out.println(result.toString());
	}
	
	@Test
	public void testFindByidnum() {
		String idnum = this.entity.getIDnum();
		List<Finance> result = this.financeManager.findbyIDnum(idnum);
		System.out.println(result.toString());
	//	assertEquals(idnum, result.get(0).getIDnum());
	}
	
	

}
