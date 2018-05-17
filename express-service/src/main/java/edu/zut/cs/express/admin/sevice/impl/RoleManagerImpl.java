package edu.zut.cs.express.admin.sevice.impl;

import org.springframework.stereotype.Component;

import edu.zut.cs.express.admin.domain.Role;
import edu.zut.cs.express.admin.service.RoleManager;
import edu.zut.cs.express.base.service.impl.GenericManagerImpl;

@Component
public class RoleManagerImpl extends GenericManagerImpl<Role, Long> implements RoleManager {

}