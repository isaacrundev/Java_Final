package com.company_mngm_sys.demo.web;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class LoginController {

    @RequestMapping("/")//login page
    public String home(/*Model model*/) {
        //model.addAttribute("formData", new User());
        return "index";
    }
   
/*@RequestMapping("/employee_greeting")
public String printEmployeeGreeting(@RequestParam String name)
    return "Hello there," +name;*/

}
