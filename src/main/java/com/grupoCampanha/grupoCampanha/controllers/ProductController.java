package com.grupoCampanha.grupoCampanha.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productController")
public class ProductController {
    public ProductController(){

    }

    @PostMapping("/createNewProductPost")
    public void createNewProductPost(Model model){

    }
}
