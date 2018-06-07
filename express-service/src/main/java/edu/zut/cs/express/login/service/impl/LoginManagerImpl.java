package edu.zut.cs.express.login.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.base.service.impl.GenericManagerImpl;
import edu.zut.cs.express.login.dao.LoginDao;
import edu.zut.cs.express.login.domain.Login;
import edu.zut.cs.express.login.service.LoginManager;

@Component
public class LoginManagerImpl extends GenericManagerImpl<Login, Long> implements LoginManager {

	LoginDao loginDao;

	@Autowired
	public void setStudentDao(LoginDao loginDao) {
		this.loginDao = loginDao;
		this.dao = this.loginDao;
	}
	
	@Override
	public List<Login> findByUserid(String userid) {

		// 创建查询条件数据对象
		Login queryObject = new Login();
		queryObject.setUserid(userid);
		// 创建匹配器，即如何使用查询条件
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				/*.withStringMatcher(StringMatcher.CONTAINING) // 改变默认字符串匹配方式：模糊查询
				.withIgnoreCase(true) // 改变默认大小写忽略方式：忽略大小写
				.withMatcher("postcode", GenericPropertyMatchers.startsWith()); // 地址采用“开始匹配”的方式查询
*/				.withMatcher("useid", GenericPropertyMatchers.startsWith())
				.withIgnorePaths("dateCreated", "dateModified");
		
		// 创建实例并查询
		Example<Login> ex = Example.of(queryObject, matcher);
		List<Login> result = dao.findAll(ex);
		return result;
	}

	@Override
	public List<Login> findByUsername(String username) {
		
		// 创建查询条件数据对象
		Login queryObject = new Login();
		queryObject.setDateCreated(null);
		queryObject.setDateModified(null);
		queryObject.setUsername(username);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				/*.withMatcher("name", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
				.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
*/				.withStringMatcher(StringMatcher.CONTAINING)
				.withIgnoreCase(true)//忽略大小写
				.withMatcher("username", GenericPropertyMatchers.startsWith());
		// 创建实例并查询
		Example<Login> ex = Example.of(queryObject, matcher);
		List<Login> result = dao.findAll(ex);
		return result;
	}


}
