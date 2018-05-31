package edu.zut.cs.express.staff.web.spring.controller;

import edu.zut.cs.express.manager.domain.Staff;
import edu.zut.cs.express.admin.service.StaffManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class StaffController extends GenericController<Staff, Long, StaffManager> {

    StaffManager staffManager;

    @Autowired
    public void setUserManager(StaffManager StaffManager) {
        this.staffManager = StaffManager;
        this.manager = this.staffManager;
    }

    @RequestMapping("/index")
    public String index() {
        return "staff/index";
    }
}