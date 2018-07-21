package edu.zut.cs.express.userorder.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.service.GenericManagerTestCase;
import edu.zut.cs.express.userorder.service.MyUserOrderManager;
import edu.zut.cs.express.userorder.domain.MyUserOrder;
import edu.zut.cs.express.zouguo.daomain.MyFinance;

/**
 * @author 杨曼珍
 *@Description 测试类 包括通过名字，id查找方法
 */
public class MyUserOrderManagerTest extends GenericManagerTestCase<Long, MyUserOrder, MyUserOrderManager>{

	MyUserOrderManager myUserOrderManager;
	
	@Autowired
	public void setUserOrderTestManager(MyUserOrderManager myUserOrderManager) {
		this.myUserOrderManager = myUserOrderManager;
		this.manager = this.myUserOrderManager;
	}
	
	
	public MyUserOrderManagerTest() {
		super(MyUserOrder.class);
		
	}
	
	/**
	 * 
	 *@Description testFindByName方法
	 */
	
	@Test
	public void testFindByName() {
		List<MyUserOrder>result=this.myUserOrderManager.findByName("王");
		assertNotNull(result);
		System.out.println(result);
	}
	
	/**
	 * 
	 *@Description testFindById方法
	 */
	
	@Test
	public void testFindById() {
		List<MyUserOrder>result=this.myUserOrderManager.findByKind("sf");
		assertNotNull(result);
		System.out.println(result);
	}
	/*
	 * 测试插入保存数据
	 * 
	 */
	
	 @Test
	    public void testSave(){
	        /**
	         * 
	         * @Description: testSave方法
	         * 
	        */
	        MyUserOrder myUserorder = new MyUserOrder();
	        myUserorder.setId(1L);
	        myUserorder.setname("杨曼珍");
	        myUserorder.setKind("SF");
	        myUserorder.setTime("20");
	        myUserorder.setEmail("@163.COM");
	        this.entity = this.manager.save( myUserorder);
	        assertNotNull(this.entity);
	        System.out.println(myUserorder);

	    }

}
