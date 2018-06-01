package edu.zut.cs.express.manager.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.manager.dao.MangerDao;
import edu.zut.cs.express.manager.domain.Manger;

public class MangerDaoTest extends GenericDaoTestCase<Long,Manger, MangerDao> {

	@Autowired
	MangerDao MangerDao;

	@Test
	public void testFindAll() {

		List<Manger> result = this.MangerDao.findAll();


	}

}