package edu.zut.cs.express.login.service;

import java.util.List;

import edu.zut.cs.express.base.service.GenericManager;
import edu.zut.cs.express.login.domain.Login;

public interface LoginManager extends GenericManager<Login, Long> {

	List<Login> findByUserid(String userid);


	List<Login> findByUsername(String username);
}

