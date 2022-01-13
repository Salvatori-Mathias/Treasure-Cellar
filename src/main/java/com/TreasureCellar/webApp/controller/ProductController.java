package com.TreasureCellar.webApp.controller;


import com.TreasureCellar.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/product")
public class ProductController {


    @GetMapping("/all")
    public String getProduct(Model model) {

        ArrayList<Product> Product= new ArrayList<>();
        Product.add(new Product());
        
        model.addAttribute("product");
        return "product";
 }

    }
