package edu.zut.cs.express.houjie.web.spring.controller;

import edu.zut.cs.express.base.web.spring.controller.GenericController;
import edu.zut.cs.express.houjie.domain.Massage;
import edu.zut.cs.express.houjie.service.MassageManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author houjie
 * @Description:
 * 
 */
@Controller
@RequestMapping("/houjie/massage")
public class MassageController extends GenericController<Massage, Long, MassageManager> {

   MassageManager massageManager;
   @RequestMapping(method = RequestMethod.GET,value = "/index.html")
   public String index(){
       String result = "/massage/index";
       return result;
   }

    @Autowired
    public void setmassageManager(MassageManager massageManager) {
        this.massageManager = massageManager;
        this.manager = this.massageManager;
    }
}