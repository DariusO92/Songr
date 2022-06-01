package com.DariusOSongr.Songr;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloWorld {
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String getTest(){

    }

}
