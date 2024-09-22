package org.chu.ecommercemvc.controller;

import org.chu.ecommercemvc.model.bean.Product;
import org.chu.ecommercemvc.model.bo.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public List<Product> listProducts() {
        return productService.findAll();
    }

    @PostMapping("")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/products";
    }
}