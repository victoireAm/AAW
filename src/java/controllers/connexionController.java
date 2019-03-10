/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import services.ConnexionService;

/**
 *
 * @author Fadwa
 */
@Controller
public class connexionController  {
    @Autowired
    ConnexionService connexionService;
    
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String init() {
        return "index";
    }
    
    @RequestMapping(value = "inscription", method = RequestMethod.GET)
    public String inscription() {
        return "inscription";
    }
    
    @RequestMapping(value = "accueil", method = RequestMethod.POST)
    protected ModelAndView login(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        System.out.println("hello");
        ModelAndView mv = new ModelAndView("accueil");
        ModelAndView mvError = new ModelAndView("index");
        String login = request.getParameter("login");
        String mdp = request.getParameter("password");
        if(login != null && login.length()>0 && mdp != null && mdp.length()>0) {
            if (connexionService.logIn(login, mdp)) {
                  mv.addObject("login", login);
            }  else {
               // return mvError;
            }
        } else {
           // System.out.println("Veuillez remplir tous les champs");
        }

        return mv;
    }
    
    
    
}
