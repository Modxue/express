package edu.zut.cs.express.customer.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.service.GenericManagerTestCase;
import edu.zut.cs.express.customer.domain.Pay;

public class PayManagerTest extends GenericManagerTestCase<Long, Pay, PayManager>{
	
	PayManager payManager;


	@Autowired
	public void setPayTestManager(PayManager payManager) {
		this.payManager = payManager;
		this.manager = this.payManager;
	}
	public  PayManagerTest() {
		super(Pay.class);
	}
	@Before
	public void setUp()throws Exception{
		Pay pay = new Pay();
		pay.setIdnum("201820");
		pay.setUser_name("薛二伟");
		pay.setUser_money(200);
		pay.setManger_money(200);
		this.entity = this.manager.save(pay);
	}
	
	@Test
	public void testFindByidnum() {
		String idnum = this.entity.getIdnum();
		List<Pay> result = this.payManager.findbyIDnum(idnum);
		//System.out.println(result.toString());
		//assertEquals(idnum, result.get(0).getIDnum());
	}
	@Test
	public void testFindByuser_name() {
		
		List<Pay> result = this.payManager.findByuser_name("薛");
		assertNotNull(result);
		//assertEquals(1, result.size());
		//assertEquals("薛二伟", result.get(0).getName());
		System.out.println(result.toString());
	}
}
