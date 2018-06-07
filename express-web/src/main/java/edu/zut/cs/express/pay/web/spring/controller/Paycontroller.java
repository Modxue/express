package edu.zut.cs.express.pay.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.express.base.web.spring.controller.GenericController;
import edu.zut.cs.express.customer.domain.Pay;
import edu.zut.cs.express.customer.service.PayManager;

	@Controller
	@RequestMapping("/Pay")
	public class Paycontroller extends GenericController<Pay, Long, PayManager> {

	    PayManager payManager;

	    @Autowired
	    public void setPayManager(PayManager payManager) {
	        this.payManager = payManager;
	        this.manager = this.payManager;
	    }

	}
