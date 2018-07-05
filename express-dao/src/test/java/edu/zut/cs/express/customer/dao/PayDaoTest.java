package edu.zut.cs.express.customer.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.customer.domain.Pay;

/**
 * @author Guozhiliang
 *@Description
 * @Date 2018年6月27日下午2:00:14
 */
public class PayDaoTest extends GenericDaoTestCase<Long, Pay, PayDao> {

	@Autowired
	PayDao payDao;
	  @Before
	    public void setEntity()
	    {
	        Pay pay = new Pay();
	        pay.setUser_name("郭志良");
	        pay.setIdnum("12");
	        pay.setUser_money(12);
	        pay.setManger_money(12);
	        Pay temp = this.payDao.save(pay);
	        System.out.println(temp);
	    }
	    @Test
	    public void testFindAll(){
	    	 /**
		     * @author Guozhiliang
		     *@Description Test DateBase connection
		     *@Date 2018年6月27日
		     */
	        List <Pay> result = this.payDao.findAll();
	        System.out.println(result);
	    }

	    @Test
	    public void testFindById(){
	        /**
	         * @author: Guozhiliang
	         * @Description: Test findByid()
	         * @Date: 2018/6/24 10:26
	        */
	        Long id = new Long(1L);
	        Optional<Pay> result;
	        result = this.payDao.findById(id);
	        assertEquals(result.isPresent(),true);
	        System.out.println(result);
	    }

	   
	    @Test
	    public void testSave(){
	    	 /**
		     * @author Guozhiliang
		     *@Description 
		     *@Date 2018年6月27日
		     */
	       Pay pay = new Pay();
	       pay.setUser_name("test_Save");
	       Pay test_Pay = this.payDao.save(pay);
	       Long pay_id = test_Pay.getId();
	       Pay result = this.payDao.getOne(pay_id);
	       assertEquals(test_Pay,result);
	    }
	}
