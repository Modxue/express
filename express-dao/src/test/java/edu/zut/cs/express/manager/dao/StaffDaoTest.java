package edu.zut.cs.express.manager.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.manager.dao.StaffDao;
import edu.zut.cs.express.manager.domain.Staff;

public class StaffDaoTest extends GenericDaoTestCase<Long, Staff, StaffDao> {

	@Autowired
	StaffDao staffDao;

	@Test
	public void testFindAll() {

		List<Staff> result = this.staffDao.findAll();

	}

}
