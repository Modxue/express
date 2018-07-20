package edu.zut.cs.express.userorder.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Optional;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.userorder.dao.MyUserOrderDao;
import edu.zut.cs.express.userorder.domain.MyUserOrder;


/**
 * @author 杨曼珍
 *@Description 测试类
 */

public class MyUserOrderDaoTest extends GenericDaoTestCase<Long, MyUserOrder, MyUserOrderDao>{
	
	/**
	 * @Description 自动装配
	 */
	@Autowired
	MyUserOrderDao myUserOrderDao;
	

	public void setMyUserOrderDao(MyUserOrderDao myUserOrderDao) {
		this.myUserOrderDao=myUserOrderDao;
		this.dao=this.myUserOrderDao;
	}
	
/**
 * @Description 查找数据库所有数据
 */
@Test
public void testFindALL() {
	
	List<MyUserOrder>result=this.myUserOrderDao.findAll();
    System.out.println(result);

}
/**
 * @Description 通过id查找数据库里面的成员
 */
@Test
public void testFindById() {
	
	Long id=new Long(23);
	Optional<MyUserOrder>result;
	result=this.myUserOrderDao.findById(id);
	assertEquals(result.isPresent(),true);
	System.out.println(result);
}


/**
 * @Description 输出
 */

	@Test
	public void test() {
		System.out.println("This is Junit Test!");
	}

}
