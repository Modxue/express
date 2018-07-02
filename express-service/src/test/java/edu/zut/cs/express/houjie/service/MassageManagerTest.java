package edu.zut.cs.express.houjie.service;

import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import edu.zut.cs.express.base.service.GenericManagerTestCase;
import edu.zut.cs.express.houjie.domain.Massage;
import edu.zut.cs.express.houjie.service.MassageManager;
/**
 * @author houjie
 *
 * @Description:Define MassageManagerTest extends GenericManagerTestCase
 */

public class MassageManagerTest extends GenericManagerTestCase<Long, Massage, MassageManager> {


	MassageManager massageManager;

	@Autowired
	public void setStudentManager(MassageManager massageManager) {
		this.massageManager = massageManager;
		this.manager = this.massageManager;
	}

	public MassageManagerTest() {
		super(Massage.class);
	}

	@Before
	public void setUp() throws Exception {
		Massage massage = new Massage();
		massage.setUserid("4");
		massage.setUsername("张三");
		massage.setPassword("123456");
		massage.setSex("男");
		this.entity = this.manager.save(massage);
	}

	@Test
	public void testFindByUsername() {
		List<Massage> result = this.massageManager.findByUsername("张");
		assertNotNull(result);
		System.out.println(result.toString());
	}
}
