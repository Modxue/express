package edu.zut.cs.express.fangye.web.spring.controller;

import edu.zut.cs.express.fangye.domain.Register;
import edu.zut.cs.express.fangye.service.RegisterManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/fangye/register")
//用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
public class RegisterController extends GenericController<Register, Long, RegisterManager> {

	RegisterManager registerManager;

    @RequestMapping(method = RequestMethod.GET,value = "/index.html")
    public String index(){
        String result = "/register/index";
        return result;
    }


    @Autowired
    public void setRegisterManager(RegisterManager registerManager) {
        this.registerManager = registerManager;
        this.manager = this.registerManager;
    }
}