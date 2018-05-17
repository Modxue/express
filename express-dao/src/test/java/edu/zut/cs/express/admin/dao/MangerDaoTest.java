package edu.zut.cs.express.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.admin.domain.Manger;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;

public class MangerDaoTest extends GenericDaoTestCase<Long,Manger, MangerDao> {

	@Autowired
	MangerDao MangerDao;

	@Test
	public void testFindAll() {

		List<Manger> result = this.MangerDao.findAll();


	}

}