package edu.zut.cs.express.Ymz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.Ymz.dao.MyUserorderDao;
import edu.zut.cs.express.Ymz.domain.MyUserorder;
import edu.zut.cs.express.Ymz.service.MyUserorderManager;
import edu.zut.cs.express.base.service.impl.GenericManagerImpl;

/**
 * @author 杨曼珍
 *
 */
@Component
public class MyUserorderManagerImpl extends GenericManagerImpl<MyUserorder, Long> implements MyUserorderManager{

	MyUserorderDao myuserorderDao;
	
	@Autowired
	public void setUserorderDao(MyUserorderDao userorderDao) {
		this.myuserorderDao = userorderDao;
		this.dao = this.myuserorderDao;
	}
	
	@Override
	public List<MyUserorder> findByKind(String kind) {
		// 创建查询条件数据对象
		MyUserorder queryObjuet = new MyUserorder();
		queryObjuet.setKind(kind);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching()//构件对象
		      .withMatcher("kind", GenericPropertyMatchers.startsWith())
		      .withIgnorePaths("dateCreated","dateModified");
		
		Example<MyUserorder> example = Example.of(queryObjuet, matcher);
		List<MyUserorder> result = dao.findAll(example);
		
		return result;
	}

	@Override
	public List<MyUserorder> findByName(String name) {
		
		MyUserorder queryObject = new MyUserorder();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setname(name);
		
		ExampleMatcher matcher = ExampleMatcher.matching()
				.withStringMatcher(StringMatcher.CONTAINING)
				.withIgnoreCase(true)
				.withMatcher("name", GenericPropertyMatchers.startsWith());
		Example<MyUserorder> example = Example.of(queryObject, matcher);
		List<MyUserorder> result = dao.findAll(example);
		
		return result;
	}

}
