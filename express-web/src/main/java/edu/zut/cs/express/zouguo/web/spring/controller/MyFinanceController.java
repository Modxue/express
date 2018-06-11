package edu.zut.cs.express.zouguo.web.spring.controller;

import edu.zut.cs.express.base.web.spring.controller.GenericController;
import edu.zut.cs.express.zouguo.daomain.MyFinance;
import edu.zut.cs.express.zouguo.service.MyFinanceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/zouguo/myFinance")
public class MyFinanceController extends GenericController <MyFinance,Long,MyFinanceManager>{

    MyFinanceManager myFinanceManager;

    @RequestMapping(method = RequestMethod.GET,value = "/index.html")
    public String index(){
        String result = "/myFinance/index";
        return result;
    }

    @Autowired
    public void setMyFinanceManager(MyFinanceManager myFinanceManager){
        this.myFinanceManager = myFinanceManager;
        this.manager = this.myFinanceManager;
    }
}
