package edu.zut.cs.express.admin.service;

import java.util.List;

import edu.zut.cs.express.manager.domain.Staff;
import edu.zut.cs.express.base.service.GenericManager;

public interface StaffManager extends GenericManager<Staff, Long> {

	List<Staff> findAll();

	Staff findbyStaffname(String Staffname);
}
