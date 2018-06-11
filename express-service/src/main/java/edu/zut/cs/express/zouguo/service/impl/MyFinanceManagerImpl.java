package edu.zut.cs.express.zouguo.service.impl;

import edu.zut.cs.express.base.service.impl.GenericManagerImpl;
import edu.zut.cs.express.zouguo.dao.MyFinanceDao;
import edu.zut.cs.express.zouguo.daomain.MyFinance;
import edu.zut.cs.express.zouguo.service.MyFinanceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyFinanceManagerImpl extends GenericManagerImpl<MyFinance,Long> implements MyFinanceManager {

    MyFinanceDao myFinanceDao;

    @Override
    public List<MyFinance> findByname(String name){
        MyFinance queryObject = new MyFinance();
        queryObject.setName(name);
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("name",ExampleMatcher.GenericPropertyMatchers.startsWith())
                .withIgnorePaths("dateCreated","dateModified");
        Example<MyFinance> ex = Example.of(queryObject,matcher);
        List<MyFinance> result = dao.findAll(ex);
        return result;
    }

    @Autowired
    public void setMyFinanceDao(MyFinanceDao myFinanceDao){
        this.myFinanceDao = myFinanceDao;
        this.dao = this.myFinanceDao;
    }

}
