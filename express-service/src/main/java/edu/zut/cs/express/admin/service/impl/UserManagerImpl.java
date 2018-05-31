package edu.zut.cs.express.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.admin.dao.userdao;
import edu.zut.cs.express.admin.domain.user;
import edu.zut.cs.express.admin.service.UserManager;
import edu.zut.cs.express.base.service.impl.GenericManagerImpl;

@Component
public class UserManagerImpl extends GenericManagerImpl<user, Long> implements UserManager {

	userdao userDao;

	@Autowired
	public void setUserDao(userdao userDao) {
		this.userDao = userDao;
		this.dao = this.userDao;
	}

	@Override
	public user findbyUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
