package edu.zut.cs.express.login.web.spring.controller;

import edu.zut.cs.express.login.domain.Login;
import edu.zut.cs.express.login.service.LoginManager;
import edu.zut.cs.express.base.web.spring.controller.GenericController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.web.bind.annotation.RequestMethod;
*/
@Controller
@RequestMapping("/login")
public class LoginController extends GenericController<Login, Long, LoginManager> {

   LoginManager loginManager;

    @Autowired
    public void setLoginManager(LoginManager loginManager) {
        this.loginManager = loginManager;
        this.manager = this.loginManager;
    }
}