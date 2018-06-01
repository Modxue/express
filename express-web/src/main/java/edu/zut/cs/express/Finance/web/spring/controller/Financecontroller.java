package edu.zut.cs.express.Finance.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.express.Finance.daomain.Finance;
import edu.zut.cs.express.Finance.service.FinanceManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/Finance")
public class Financecontroller extends GenericController<Finance, Long, FinanceManager>{
	
	FinanceManager financeManager;
	
	@Autowired
	public void setFinanceManager(FinanceManager financeManager) {
		this.financeManager = financeManager;
		this.manager = this.financeManager;
	}
}
