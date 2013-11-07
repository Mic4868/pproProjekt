/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.uhk.task.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mira
 */
@Controller
public class HomeController {
    
    @RequestMapping("/home")
    public String home(Model model){
        
    
        return "home";
    }
    
}
