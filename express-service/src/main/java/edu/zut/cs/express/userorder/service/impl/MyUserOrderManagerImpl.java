package edu.zut.cs.express.userorder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.base.service.impl.GenericManagerImpl;
import edu.zut.cs.express.userorder.dao.MyUserOrderDao;
import edu.zut.cs.express.userorder.domain.MyUserOrder;
import edu.zut.cs.express.userorder.service.MyUserOrderManager;

/**
 * @author 杨曼珍
 *@Description 实现接口，重写了两个find方法
 */

@Component
public class MyUserOrderManagerImpl extends GenericManagerImpl<MyUserOrder, Long> implements MyUserOrderManager{

	MyUserOrderDao myuserorderDao;
	
	@Autowired
	public void setUserorderDao(MyUserOrderDao userorderDao) {
		this.myuserorderDao = userorderDao;
		this.dao = this.myuserorderDao;
	}
	/**
	 *@Description 重写接口findByKind方法
	 */
	@Override
	public List<MyUserOrder> findByKind(String kind) {
		// 创建查询条件数据对象
		MyUserOrder queryObjuet = new MyUserOrder();
		queryObjuet.setKind(kind);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching()//构件对象
		      .withMatcher("kind", GenericPropertyMatchers.startsWith())
		      .withIgnorePaths("dateCreated","dateModified");
		
		Example<MyUserOrder> example = Example.of(queryObjuet, matcher);
		List<MyUserOrder> result = dao.findAll(example);
		
		return result;
	}
	
	/**
	 *@Description 重写接口findByName方法
	 */
	
	@Override
	public List<MyUserOrder> findByName(String name) {
		
		MyUserOrder queryObject = new MyUserOrder();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setname(name);
		
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withStringMatcher(StringMatcher.CONTAINING)
				.withIgnoreCase(true)
				.withMatcher("name", GenericPropertyMatchers.startsWith());
		Example<MyUserOrder> example = Example.of(queryObject, matcher);
		List<MyUserOrder> result = dao.findAll(example);
		
		return result;
	}

}
