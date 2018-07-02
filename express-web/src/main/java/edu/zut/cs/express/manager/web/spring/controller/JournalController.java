package edu.zut.cs.express.manager.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.express.manager.domain.Journal;
import edu.zut.cs.express.manager.service.JournalManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/manager/journal")
public class JournalController extends GenericController<Journal, Long, JournalManager>{
	
	JournalManager journalManager;
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/journal/index";
		return result;
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/journal.html")
	public String journal() {
		String result = "/journal/journal";
		return result;
	}
	
	@Autowired
	public void setJournalManager(JournalManager journalManager) {
		this.journalManager = journalManager;
		this.manager = this.journalManager;
	}
}