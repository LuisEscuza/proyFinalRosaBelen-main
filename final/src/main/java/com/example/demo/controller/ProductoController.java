package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    
    @RequestMapping("/")
    public String inicio(){
       
        return "producto/index";
    }
   
}