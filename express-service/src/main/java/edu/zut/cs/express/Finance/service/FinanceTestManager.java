package edu.zut.cs.express.Finance.service;

import java.util.List;

import edu.zut.cs.express.Finance.daomain.FinanceTest;
import edu.zut.cs.express.base.service.GenericManager;

public interface FinanceTestManager extends GenericManager<FinanceTest,Long>{
	
	List<FinanceTest> FindAll();
}
