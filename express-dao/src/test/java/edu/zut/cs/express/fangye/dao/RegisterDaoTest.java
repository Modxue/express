package edu.zut.cs.express.fangye.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Optional;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.express.base.dao.GenericDaoTestCase;
import edu.zut.cs.express.fangye.domain.Register;
/**
 * @author FangYe
 * 测试
 */
public class RegisterDaoTest extends GenericDaoTestCase<Long, Register, RegisterDao> {

	@Autowired
	RegisterDao registerDao;

	@Test
	public void TestById() {
		Long id=new Long(1L);
		Optional<Register> result=this.registerDao.findById(id);
		assertEquals(result.isPresent(), true);
		System.out.println(result);
	}
	
	
	@Test
	public void testFindAll() {

		List<Register> result = this.registerDao.findAll();

	}

}