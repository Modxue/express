package edu.zut.cs.express.Ymz.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.express.Ymz.domain.MyUserorder;
import edu.zut.cs.express.Ymz.service.MyUserorderManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;

/*
 * @author 杨曼珍
 * 控制映射
 */



@Controller
@RequestMapping("/Ymz/myUserorder")
public class MyUserordercontroller extends GenericController<MyUserorder, Long, MyUserorderManager>{
	
	MyUserorderManager myUserorderManager;
	 @RequestMapping(method = RequestMethod.GET,value = "/index.html")
	    public String index(){
	        String result = "/myUserorder/index";
	        return result;
	    }
	
	@Autowired
	public void setUserorderManager(MyUserorderManager myUserorderManager) {
		
		this.myUserorderManager = myUserorderManager;
		this.manager = this.myUserorderManager;
	}
	
	
}
