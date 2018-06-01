package edu.zut.cs.express.Finance.service.impl;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.Finance.dao.FinanceDao;
import edu.zut.cs.express.Finance.daomain.Finance;
import edu.zut.cs.express.Finance.service.FinanceManager;
import edu.zut.cs.express.base.service.impl.GenericManagerImpl;

@Component
public class FinanceManagerImpl extends GenericManagerImpl<Finance,Long> implements FinanceManager{

	FinanceDao financeDao;
	
	@Autowired
	public void setDinanceDao(FinanceDao financeDao) {
		this.financeDao = financeDao;
		this.dao = this.financeDao;
	}
	
	@Override
	public List<Finance> findbyIDnum(String idnum) {
		// 创建查询条件数据对象
		Finance queryObjuet = new Finance();
		queryObjuet.setIDnum(idnum);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() //构件对象
				.withMatcher("idnum", GenericPropertyMatchers.startsWith())
				.withIgnorePaths("dateCreated", "dateModified");
		//创建实例并查询
		Example<Finance> example = Example.of(queryObjuet,matcher);
		List<Finance> result = dao.findAll(example);
		return result;
	}

	@Override
	public List<Finance> findbyName(String name) {
		
		//创建查询条件数据对象
		Finance queryObject = new Finance();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setName(name);
		//创建适配器
		ExampleMatcher matcher = ExampleMatcher.matching() //构件对象
				.withStringMatcher(StringMatcher.CONTAINING)
				.withIgnoreCase(true)//忽略大小写
				.withMatcher("name", GenericPropertyMatchers.startsWith());
		//创建实例并查询
		Example<Finance> example = Example.of(queryObject,matcher);
		List<Finance> result = dao.findAll(example);
		return result;
	}

	
}
