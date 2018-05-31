package edu.zut.cs.express.Finance.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.zut.cs.express.Finance.daomain.FinanceTest;
import edu.zut.cs.express.Finance.service.FinanceTestManager;
import edu.zut.cs.express.base.service.impl.GenericManagerImpl;

@Component
public class FinanceTestManagerImpl extends GenericManagerImpl<FinanceTest,Long> implements FinanceTestManager{

	@Override
	public List<FinanceTest> FindAll() {
		List<FinanceTest> result = new ArrayList<FinanceTest>();
		for (int i = 0; i < 2; i++) {
			FinanceTest u = new FinanceTest();
			u.getMoney();
			result.add(u);
		}
		return result;
	}

}
