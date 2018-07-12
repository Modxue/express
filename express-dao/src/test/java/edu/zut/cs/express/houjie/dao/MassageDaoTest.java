package edu.zut.cs.express.houjie.dao;

//import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.houjie.dao.MassageDao;
import edu.zut.cs.express.houjie.domain.Massage;

/**
 * @author houjie
 * @Description:test
 * 
 */
public class MassageDaoTest extends GenericDaoTestCase<Long, Massage, MassageDao> {

	@Autowired
	MassageDao MassageDao;

	@Test
	public void test() {
		System.out.println("This is Junit Test!");
	
	}

}