package edu.zut.cs.express.staff.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import edu.zut.cs.express.base.service.GenericGenerator;
import edu.zut.cs.express.staff.domain.Staff;
import edu.zut.cs.express.staff.service.StaffManager;

public class StaffEntityGenerator extends GenericGenerator {

	List<Staff> staffList;

	StaffManager staffManager;

	@Autowired
	public void setStaffManager(StaffManager staffManager) {
		this.staffManager = staffManager;
	}

	@Test
	public void test() {
		this.staffManager.save(this.staffList);
		List<Staff> result = this.staffManager.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Student> result=" + result); //$NON-NLS-1$
		}
	}

}
