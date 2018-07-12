package edu.zut.cs.express.journal.web.spring.controller;

import edu.zut.cs.express.journal.daomain.UJournal;
import edu.zut.cs.express.journal.service.UJournalManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author GreyYa
 *
 */
@Controller
@RequestMapping("/ujournal")
public class UJournalController extends GenericController<UJournal, Long, UJournalManager> {

	UJournalManager ujournalManager;

    @RequestMapping(method = RequestMethod.GET,value = "/index.html")
    public String index(){
        String result = "/ujournal/index";
        return result;
    }


    @Autowired
    public void setRegisterManager(UJournalManager ujournalManager) {
        this.ujournalManager = ujournalManager;
        this.manager = this.ujournalManager;
        
    }
}