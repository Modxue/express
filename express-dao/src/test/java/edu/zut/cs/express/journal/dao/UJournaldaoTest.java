package edu.zut.cs.express.journal.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.journal.daomain.UJournal;

public class UJournaldaoTest extends GenericDaoTestCase<Long, UJournal, UJournalDao> {

	@Autowired
	UJournalDao ujournaldao;

	@Test
	public void test() {
		System.out.println("This is Junit Test!");
	}


}
