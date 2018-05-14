package edu.zut.cs.express.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.admin.domain.user;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;

public class UserDaoTest extends GenericDaoTestCase<Long, user, userdao> {

	@Autowired
	userdao userDao;

	@Test
	public void testFindAll() {

		List<user> result = this.userDao.findAll();

	}

}
