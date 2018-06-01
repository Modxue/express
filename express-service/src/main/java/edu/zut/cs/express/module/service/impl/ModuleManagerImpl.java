package edu.zut.cs.express.module.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.express.base.service.impl.GenericTreeManagerImpl;
import edu.zut.cs.express.module.dao.ModuleDao;
import edu.zut.cs.express.module.domain.Module;
import edu.zut.cs.express.module.service.ModuleManager;

@Component
public class ModuleManagerImpl extends GenericTreeManagerImpl<Module, Long> implements ModuleManager {

    ModuleDao moduleDao;

    @Autowired
    public void setModuleDao(ModuleDao moduleDao) {
        this.moduleDao = moduleDao;
        this.dao = this.moduleDao;
        this.treeDao = this.moduleDao;
    }

}
