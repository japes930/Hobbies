package com.example.hobbies;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @RequestMapping("/index") //when user requests this page
    public String homePage(){
        return "index";
    }

    @RequestMapping("/gaming") //when user requests this page
    public String page2(){
        return "gaming";
    }

    @RequestMapping("/netflix") //when user requests this page
    public String page3(){
        return "netflix";
    }

}
