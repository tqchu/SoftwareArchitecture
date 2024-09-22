package org.chu.ecommercemvc.controller;

import org.chu.ecommercemvc.model.bean.Product;
import org.chu.ecommercemvc.model.bo.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private BaseService<Product, Long> productService;

    @GetMapping("/products")
    public String listProducts(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        model.addAttribute("product", new Product());
        return "products";
    }

    @PostMapping("/products")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/products";
    }
}