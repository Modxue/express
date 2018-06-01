package edu.zut.cs.express.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.express.admin.service.GroupManager;
import edu.zut.cs.express.base.service.impl.GenericTreeManagerImpl;
import edu.zut.cs.express.manager.dao.GroupDao;
import edu.zut.cs.express.manager.domain.Group;

@Service("groupManager")
@Transactional
public class GroupManagerImpl extends GenericTreeManagerImpl<Group, Long> implements GroupManager {

	GroupDao groupDao;

	@Autowired
	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
		this.treeDao = this.groupDao;
		this.dao = this.treeDao;
	}

}