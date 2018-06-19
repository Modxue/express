package edu.zut.cs.express.Userorder.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.Ymz.domain.MyUserorder;
import edu.zut.cs.express.Ymz.service.MyUserorderManager;
import edu.zut.cs.express.base.service.GenericManagerTestCase;

/**
 * @author 杨曼珍
 *
 */
public class UserorderManagerTest extends GenericManagerTestCase<Long, MyUserorder, MyUserorderManager>{

	MyUserorderManager userorderManager;
	
	@Autowired
	public void setUserorderTestManager(MyUserorderManager userorderManager) {
		this.userorderManager = userorderManager;
		this.manager = this.userorderManager;
	}
	
	
	public UserorderManagerTest() {
		super(MyUserorder.class);
		
	}
	
	@Test
	public void testFindByname() {
		System.out.println("This is Junit Test");
	}

}
