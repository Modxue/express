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

   @RequestMapping(method = RequestMethod.GET,value = "/main1.html")
   public String main1(){
       String result = "/massage/main1";
       return result;
   }
   
   @RequestMapping(method = RequestMethod.GET,value = "/head.html")
   public String head(){
       String result = "/massage/head";
       return result;
   }
   
   @RequestMapping(method = RequestMethod.GET,value = "/body1.html")
   public String body1(){
       String result = "/massage/body1";
       return result;
   }
   
   @RequestMapping(method = RequestMethod.GET,value = "/body2.html")
   public String body2(){
       String result = "/massage/body2";
       return result;
   }
   
   @RequestMapping(method = RequestMethod.GET,value = "/foot.html")
   public String foot(){
       String result = "/massage/foot";
       return result;
   }
    @Autowired
    public void setmassageManager(MassageManager massageManager) {
        this.massageManager = massageManager;
        this.manager = this.massageManager;
    }
}