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
import services.InscriptionService;

/**
 *
 * @author Fadwa
 */
@Controller
public class inscriptionController {
     @Autowired
     InscriptionService inscriptionService;
     
   
     
    @RequestMapping(value = "inscription", method = RequestMethod.POST)
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String result;
        ModelAndView mv = new ModelAndView("message");
        String nom = request.getParameter("nom");
      //  inscriptionService.inscription(nom);
       // result = helloService.getNomsMessages();
     //   mv.addObject("helloMessage", result);
        return mv;
    }
}
