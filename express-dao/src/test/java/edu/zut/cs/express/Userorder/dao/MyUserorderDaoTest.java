package edu.zut.cs.express.Userorder.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Optional;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.Ymz.dao.MyUserorderDao;
import edu.zut.cs.express.Ymz.domain.MyUserorder;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;


/**
 * @author 杨曼珍
 *测试
 */
public class MyUserorderDaoTest extends GenericDaoTestCase<Long, MyUserorder, MyUserorderDao>{
	
	@Autowired
	MyUserorderDao myUserorderDao;
	
	public void setMyUserorderDao(MyUserorderDao myUserorderDao) {
		this.myUserorderDao=myUserorderDao;
		this.myUserorderDao=this.myUserorderDao;
	}
	
/**
 * 查找数据库所有数据
 */
@Test
public void testFindALL() {
	
	List<MyUserorder>result=this.myUserorderDao.findAll();
    System.out.println(result);

}
/**
 * 通过id查找数据库里面的成员
 */
@Test
public void testFindById() {
	
	Long id=new Long(23);
	Optional<MyUserorder>result;
	result=this.myUserorderDao.findById(id);
	assertEquals(result.isPresent(),true);
	System.out.println(result);
}



	@Test
	public void test() {
		System.out.println("This is Junit Test!");
	}

}
