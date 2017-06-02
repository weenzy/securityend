package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
    @Autowired
    PersonRepository personRepository;
    @RequestMapping("/")
    public ModelAndView peoplelist() {return new ModelAndView("list", "people", personRepository.findAll());}
}