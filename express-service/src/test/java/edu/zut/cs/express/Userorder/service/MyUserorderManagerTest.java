package edu.zut.cs.express.Userorder.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.Ymz.domain.MyUserorder;
import edu.zut.cs.express.Ymz.service.MyUserorderManager;
import edu.zut.cs.express.base.service.GenericManagerTestCase;
import edu.zut.cs.express.zouguo.daomain.MyFinance;

/**
 * @author 杨曼珍
 *测试
 */
public class MyUserorderManagerTest extends GenericManagerTestCase<Long, MyUserorder, MyUserorderManager>{

	MyUserorderManager myUserorderManager;
	
	@Autowired
	public void setUserorderTestManager(MyUserorderManager myUserorderManager) {
		this.myUserorderManager = myUserorderManager;
		this.manager = this.myUserorderManager;
	}
	
	
	public MyUserorderManagerTest() {
		super(MyUserorder.class);
		
	}
	
	@Test
	public void testFindByname() {
		List<MyUserorder>result=this.myUserorderManager.findByName("王");
		assertNotNull(result);
		System.out.println(result);
	}
	
	@Test
	public void testFindByid() {
		List<MyUserorder>result=this.myUserorderManager.findByKind("sf");
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
	         * @author: Zouguo0212
	         * @Description:
	         * @Date: 2018/6/24 15:20
	        */
	        MyUserorder myUserorder = new MyUserorder();
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
