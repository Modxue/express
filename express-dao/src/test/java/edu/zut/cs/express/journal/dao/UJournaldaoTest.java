package edu.zut.cs.express.journal.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.journal.dao.UJournalDao;
import edu.zut.cs.express.journal.daomain.UJournal;

public class UJournaldaoTest extends GenericDaoTestCase<Long, UJournal, UJournalDao> {

	@Autowired
	UJournalDao ujournaldao;

	@Test
	public void testFindAll() {

		List<UJournal> result = this.ujournaldao.findAll();

	}

}
