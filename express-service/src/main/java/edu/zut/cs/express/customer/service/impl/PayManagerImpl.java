package edu.zut.cs.express.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.base.service.impl.GenericManagerImpl;
import edu.zut.cs.express.customer.dao.PayDao;
import edu.zut.cs.express.customer.domain.Pay;
import edu.zut.cs.express.customer.service.PayManager;

@Component
public class PayManagerImpl extends GenericManagerImpl<Pay,Long> implements PayManager{

	PayDao payDao;
	
	@Autowired
	public void setPayDao(PayDao payDao) {
		this.payDao = payDao;
		this.dao = this.payDao;
	}
	@Override
	public List<Pay> findbyIDnum(String idnum) {
		// 创建查询条件数据对象
		Pay queryObjuet = new Pay();
		queryObjuet.setIdnum(idnum);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() //构件对象
				.withMatcher("idnum", GenericPropertyMatchers.startsWith())
				.withIgnorePaths("dateCreated", "dateModified");
		//创建实例并查询
		Example<Pay> example = Example.of(queryObjuet,matcher);
		List<Pay> result = dao.findAll(example);
		return result;
	}

	
	@Override
	public List<Pay> findByuser_name(String username) {
		// 创建查询条件数据对象
		Pay queryObjuet = new Pay();
		queryObjuet.setUser_name(username);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() //构件对象
				.withMatcher("username", GenericPropertyMatchers.startsWith())
				.withIgnorePaths("dateCreated", "dateModified");
		//创建实例并查询
		Example<Pay> example = Example.of(queryObjuet,matcher);
		List<Pay> result = dao.findAll(example);
		return result;
	}


}