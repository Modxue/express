package edu.zut.cs.express.houjie.service;

import java.util.List;

import edu.zut.cs.express.base.service.GenericManager;
import edu.zut.cs.express.houjie.domain.Massage;

/**
 * @author houjie
 * @Description:Define interface
 * 
 */
public interface MassageManager extends GenericManager<Massage, Long> {

	List<Massage> findByUserid(String userid);


	List<Massage> findByUsername(String username);
}

