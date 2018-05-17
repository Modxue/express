package edu.zut.cs.express.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.admin.domain.user_order;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;

public class user_orderDaoTest extends GenericDaoTestCase<Long, user_order, user_orderDAO> {

	@Autowired
	user_orderDAO user_orderDAO;

	@Test
	public void testFindAll() {

		List<user_order> result = this.user_orderDAO.findAll();

	}

}
