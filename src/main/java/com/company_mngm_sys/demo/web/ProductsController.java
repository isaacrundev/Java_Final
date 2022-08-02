package com.company_mngm_sys.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company_mngm_sys.demo.dao.ProductsRepository;
import com.company_mngm_sys.demo.entity.Products;


@Controller
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ProductsRepository productRepo;



    @GetMapping
    public String displayProducts(Model model){
        
        List<Products>products = productRepo.findAll();
        model.addAttribute("products", products);

        return "products/list_products";

    }

    @GetMapping("/new")
    public String displayProductForm(Model model){
        // Employee someEmployee = new Employee();
        model.addAttribute("anything", new Products());
        return "products/new_product";
    }

    @PostMapping("/save")       
    public String createEmployee(Products product){
        product.setProductId(0);
        productRepo.save(product);
        return "redirect:/products";
    }

}
