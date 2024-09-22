package org.chu.ecommercemvc.controller;

import org.chu.ecommercemvc.model.bean.Product;
import org.chu.ecommercemvc.model.bo.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private BaseService<Product, Long> productService;

    @GetMapping("")
    public List<Product> listProducts(){
        List<Product> products = productService.findAll();
        return products;
    }

    @PostMapping("")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/products";
    }
}