package edu.zut.cs.express.journal.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.express.journal.daomain.UJournal;
import edu.zut.cs.express.journal.service.UJournalManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/UJournal")
public class UJournalcontroller extends GenericController<UJournal, Long, UJournalManager>{
	
	UJournalManager ujournalManager;
	
	@Autowired
	public void setFinanceManager(UJournalManager ujournalManager) {
		this.ujournalManager = ujournalManager;
		this.manager = this.ujournalManager;
	}
}

