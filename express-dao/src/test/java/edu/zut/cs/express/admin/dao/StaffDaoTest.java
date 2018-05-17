package edu.zut.cs.express.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.admin.domain.Staff;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;

public class StaffDaoTest extends GenericDaoTestCase<Long, Staff, StaffDao> {

	@Autowired
	StaffDao staffDao;

	@Test
	public void testFindAll() {

		List<Staff> result = this.staffDao.findAll();

	}

}
