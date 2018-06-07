package edu.zut.cs.express.module.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.express.base.service.GenericManagerTestCase;
import edu.zut.cs.express.customer.domain.Customer;
import edu.zut.cs.express.customer.service.CustomerManager;

public class ModuleManagerTest extends GenericManagerTestCase<Long, Customer, CustomerManager> {

    @Autowired
    ModuleManager moduleManager;

    public ModuleManagerTest() {
        super(Customer.class);
    }

}
