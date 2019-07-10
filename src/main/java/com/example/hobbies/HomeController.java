package com.example.hobbies;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @RequestMapping("/") //when user requests this page
    public String index(){
        return "index";
    }

    @RequestMapping("/gaming") //when user requests this page
    public String gaming(){
        return "gaming";
    }

    @RequestMapping("/sports") //when user requests this page
    public String sports(){
        return "sports";
    }

}
