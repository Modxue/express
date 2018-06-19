package edu.zut.cs.express.Userorder.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.Ymz.dao.MyUserorderDao;
import edu.zut.cs.express.Ymz.domain.MyUserorder;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;


/**
 * @author 杨曼珍
 *
 */
public class UserorderDaoTest extends GenericDaoTestCase<Long, MyUserorder, MyUserorderDao>{
	
	@Autowired
	MyUserorderDao userorderDao;
	
	@Test
	public void test() {
		System.out.println("This is Junit Test!");
	}

}
