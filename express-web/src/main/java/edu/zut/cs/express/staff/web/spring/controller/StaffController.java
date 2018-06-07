package edu.zut.cs.express.staff.web.spring.controller;

import edu.zut.cs.express.staff.domain.Staff;
import edu.zut.cs.express.staff.service.StaffManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/staff")
public class StaffController extends GenericController<Staff, Long, StaffManager> {

    StaffManager staffManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/staff/index";
		return result;
	}

    @Autowired
    public void setStaffManager(StaffManager StaffManager) {
        this.staffManager = StaffManager;
        this.manager = this.staffManager;
    }
}