package edu.zut.cs.express.userorder.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.express.base.web.spring.controller.GenericController;
import edu.zut.cs.express.userorder.service.MyUserOrderManager;
import edu.zut.cs.express.userorder.domain.MyUserOrder;

/**
 * @author 杨曼珍
 * @Description 控制映射类
 */



@Controller
@RequestMapping("/userorder")
public class MyUserOrderController extends GenericController<MyUserOrder, Long, MyUserOrderManager>{
	
	 /**
	  * 
	  * @Description 后台页面
	  */
	
	MyUserOrderManager myUserOrderManager;
	 @RequestMapping(method = RequestMethod.GET,value = "/index.html")
	    public String index(){
	        String result = "/userorder/index";
	        return result;
	    }
	
	 /**
	  * 
	  * @Description 用户预约界面
	  */
	 
	 @RequestMapping(method = RequestMethod.GET,value = "/order.html")
	    public String user(){
	        String result = "/userorder/order";
	        return result;
	    }
	 
	
	 
	@Autowired
	public void setUserOrderManager(MyUserOrderManager myUserOrderManager) {
		
		this.myUserOrderManager = myUserOrderManager;
		this.manager = this.myUserOrderManager;
	}
	
	
}
