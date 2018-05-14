package edu.zut.cs.express.admin.service;

import java.util.List;

import edu.zut.cs.express.admin.domain.user;
import edu.zut.cs.express.base.service.GenericManager;

public interface UserManager extends GenericManager<user, Long> {

	List<user> findAll();

	user findbyUsername(String username);
}
