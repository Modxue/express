package edu.zut.cs.express.manager.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.manager.dao.userdao;
import edu.zut.cs.express.manager.domain.user;

public class UserDaoTest extends GenericDaoTestCase<Long, user, userdao> {

	@Autowired
	userdao userDao;

	@Test
	public void testFindAll() {

		List<user> result = this.userDao.findAll();

	}

}
