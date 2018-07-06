package edu.zut.cs.express.zsy.web.spring.controller;

import edu.zut.cs.express.base.web.spring.controller.GenericController;
import edu.zut.cs.express.zsy.domain.Staff;
import edu.zut.cs.express.zsy.service.StaffManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author:zsy0216
 * @Description:defined class StaffController
 */
@Controller
@RequestMapping("/zsy/staff")
public class StaffController extends GenericController<Staff, Long, StaffManager> {

	StaffManager staffManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/staff/index";
		return result;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/page.html")
	public String page() {
		String result = "/staff/page";
		return result;
	}
	@Autowired
	public void setStaffManager(StaffManager StaffManager) {
		this.staffManager = StaffManager;
		this.manager = this.staffManager;
	}
}