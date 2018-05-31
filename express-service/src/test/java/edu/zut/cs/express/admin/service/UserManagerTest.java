package edu.zut.cs.express.admin.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.express.manager.domain.user;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class UserManagerTest {

	@Autowired
	UserManager userManager;

	@Test
	public void testFindAll() {
		List<user> all = this.userManager.findAll();
		assertEquals(all.size(), 100);
	}

	@Test
	public void testFindbyUsername() {
		String username = "world";
		user expected_user = new user();
		// expected_user.setUsername(username);
		user user = this.userManager.findbyUsername(username);
		// assertEquals(user.getUsername(), expected_user.getUsername());
		assertEquals(user, expected_user);
	}
}