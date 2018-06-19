package edu.zut.cs.express.journal.service;

import java.util.List;

import edu.zut.cs.express.journal.daomain.UJournal;
import edu.zut.cs.express.base.service.GenericManager;

public interface UJournalManager extends GenericManager<UJournal,Long>{
	
	/**
	
	 * @Description:按用户名查找
	
	 * @param username
	 * @return
	
	 * List<UJournal>
	
	 * @author: GreyYa
	
	 * @time:2018年6月19日 上午10:04:57
	
	 */
	List<UJournal> findByusername(String username);
	
	/**
	
	 * @Description:按邮箱查找
	
	 * @param email
	 * @return
	
	 * List<UJournal>
	
	 * @author: GreyYa
	
	 * @time:2018年6月19日 上午10:08:02
	
	 */
	List<UJournal> findByemail(String email);
}
