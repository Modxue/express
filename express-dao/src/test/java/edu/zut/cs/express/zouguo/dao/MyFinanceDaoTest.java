package edu.zut.cs.express.zouguo.dao;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.zouguo.daomain.MyFinance;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * @author: Zouguo0212
 * @Description: Complete MyFinanceDaoTest
 * @Date: 2018/6/24 10:24
*/
public class MyFinanceDaoTest extends GenericDaoTestCase<Long,MyFinance,MyFinanceDao> {

    @Autowired
    MyFinanceDao myFinanceDao;

    @Before
    public void setEntity()
    {
        MyFinance myFinance = new MyFinance();
        myFinance.setName("徐X");
        myFinance.setSex("女");
        myFinance.setBalance(50000);
        myFinance.setAge(18);
        MyFinance temp = this.myFinanceDao.save(myFinance);
        System.out.println(temp);
    }
    @Test
    public void testFindAll(){
        /**
         * @author: Zouguo0212
         * @Description: Test DB_connet
         * @Date: 2018/6/24 10:26
        */
        List <MyFinance> result = this.myFinanceDao.findAll();
        System.out.println(result);
    }

    @Test
    public void testFindById(){
        /**
         * @author: Zouguo0212
         * @Description: Test findByid()
         * @Date: 2018/6/24 10:26
        */
        Long id = new Long(1L);
        Optional<MyFinance> result;

        result = this.myFinanceDao.findById(id);
        assertEquals(result.isPresent(),true);
        System.out.println(result);
    }

    @Test
    public void testSave(){
       /**
        * @author: Zouguo0212
        * @Description: Test save() and getone() by id
        * @Date: 2018/6/24 11:13
       */
       MyFinance myFinance = new MyFinance();
       myFinance.setName("test_Save");
       MyFinance test_Finance = this.myFinanceDao.save(myFinance);
       Long finance_id = test_Finance.getId();
       MyFinance result = this.myFinanceDao.getOne(finance_id);
       assertEquals(test_Finance,result);
     //  System.out.println(test_Finance);
    //   System.out.println(result);
    }
}
