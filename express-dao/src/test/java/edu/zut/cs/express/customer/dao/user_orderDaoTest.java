package edu.zut.cs.express.customer.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.customer.dao.user_orderDAO;
import edu.zut.cs.express.customer.domain.user_order;

public class user_orderDaoTest extends GenericDaoTestCase<Long, user_order, user_orderDAO> {

	@Autowired
	user_orderDAO user_orderDAO;

	@Test
	public void testFindAll() {

		List<user_order> result = this.user_orderDAO.findAll();

	}

}
