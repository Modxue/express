package edu.zut.cs.express.manager.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.admin.service.GroupManager;
import edu.zut.cs.express.base.service.GenericTreeManagerTestCase;
import edu.zut.cs.express.manager.domain.Group;


public class GroupManagerTest extends GenericTreeManagerTestCase<Long, Group, GroupManager> {

	GroupManager groupManager;


	@Autowired
	public void setGroupManager(GroupManager groupManager) {
		this.groupManager = groupManager;
		this.manager = this.groupManager;
	}
	public GroupManagerTest() {
		super(Group.class);

	}

}
