package edu.zut.cs.express.houjie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.base.service.impl.GenericManagerImpl;
import edu.zut.cs.express.houjie.dao.MassageDao;
import edu.zut.cs.express.houjie.domain.Massage;
import edu.zut.cs.express.houjie.service.MassageManager;

/**
 * @author houjie
 * @Description:class MassageManager implements
 * 
 */
@Component
public class MassageManagerImpl extends GenericManagerImpl<Massage, Long> implements MassageManager {

	MassageDao massageDao;

	@Autowired
	public void setStudentDao(MassageDao massageDao) {
		this.massageDao = massageDao;
		this.dao = this.massageDao;
	}
	
	@Override
	public List<Massage> findByUserid(String userid) {

		// 创建查询条件数据对象
		Massage queryObject = new Massage();
		queryObject.setUserid(userid);
		// 创建匹配器，即如何使用查询条件
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withStringMatcher(StringMatcher.CONTAINING) // 改变默认字符串匹配方式：模糊查询
				.withIgnoreCase(true) // 改变默认大小写忽略方式：忽略大小写
 			    .withMatcher("useid", GenericPropertyMatchers.startsWith());
		
		// 创建实例并查询
		Example<Massage> ex = Example.of(queryObject, matcher);
		List<Massage> result = dao.findAll(ex);
		return result;
	}

	@Override
	public List<Massage> findByUsername(String username) {
		
		// 创建查询条件数据对象
		Massage queryObject = new Massage();
		queryObject.setUsername(username);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withMatcher("name", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
				.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
		// 创建实例并查询
		Example<Massage> ex = Example.of(queryObject, matcher);
		List<Massage> result = dao.findAll(ex);
		return result;
	}

	@Autowired
	public void setMassageDao(MassageDao massageDao) {
		this.massageDao = massageDao;
		this.dao = this.massageDao;
	}

}
