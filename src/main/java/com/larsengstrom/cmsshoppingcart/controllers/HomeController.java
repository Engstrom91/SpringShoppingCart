package com.larsengstrom.cmsshoppingcart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller /*Identifies this class as a component before component scanning takes place,
during component scanning an instance of this class will be created and will become a bean. */
public class HomeController {
    
    @GetMapping("/testMapping") //We're supposed to just leave this here even though it does nothing?
    public String home(){
        return "home"; //It looks like we're returning a String but actually it will try to return a view file.(Home.html)
    }

}
