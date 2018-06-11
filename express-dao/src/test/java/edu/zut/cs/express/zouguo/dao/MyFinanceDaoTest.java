package edu.zut.cs.express.zouguo.dao;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.zouguo.daomain.MyFinance;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MyFinanceDaoTest extends GenericDaoTestCase<Long,MyFinance,MyFinanceDao> {

    @Autowired
    MyFinanceDao myFinanceDao;

    @Test
    public void testFindAll(){
        System.out.println("This is a junit4 test !");
    }

}
