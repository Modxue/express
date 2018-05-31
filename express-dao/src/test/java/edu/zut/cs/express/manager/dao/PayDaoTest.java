package edu.zut.cs.express.manager.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.manager.dao.PayDao;
import edu.zut.cs.express.manager.domain.Pay;

public class PayDaoTest extends GenericDaoTestCase<Long, Pay, PayDao> {

	@Autowired
	PayDao payDao;

	@Test
	public void testFindAll() {

		List<Pay> result = this.payDao.findAll();

	}

}

