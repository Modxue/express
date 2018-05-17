package edu.zut.cs.express.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.admin.domain.Journal;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;

public class JournalDaoTest extends GenericDaoTestCase<Long, Journal, JournalDao> {

	@Autowired
	JournalDao journalDao;

	@Test
	public void testFindAll() {

		List<Journal> result = this.journalDao.findAll();

	}

}
