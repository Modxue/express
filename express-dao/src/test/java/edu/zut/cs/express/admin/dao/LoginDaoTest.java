package edu.zut.cs.express.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.admin.domain.Login;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;

public class LoginDaoTest extends GenericDaoTestCase<Long, Login, LoginDao> {

	@Autowired
	LoginDao LoginDao;

	@Test
	public void testFindAll() {

		List<Login> result = this.LoginDao.findAll();

	}

}