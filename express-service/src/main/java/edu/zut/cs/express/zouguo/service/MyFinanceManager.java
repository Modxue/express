package edu.zut.cs.express.zouguo.service;

import edu.zut.cs.express.base.service.GenericManager;
import edu.zut.cs.express.zouguo.daomain.MyFinance;

import java.util.List;

public interface MyFinanceManager extends GenericManager<MyFinance,Long> {

    List<MyFinance> findByname(String name);
    
}
