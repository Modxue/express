package edu.zut.cs.express.admin.service.impl;

import org.springframework.stereotype.Component;

import edu.zut.cs.express.admin.service.RoleManager;
import edu.zut.cs.express.base.service.impl.GenericManagerImpl;
import edu.zut.cs.express.manager.domain.Role;

@Component
public class RoleManagerImpl extends GenericManagerImpl<Role, Long> implements RoleManager {
}

