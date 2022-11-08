package com.arjunan.springbootmongodb.controller;

import com.arjunan.springbootmongodb.dto.ProductDto;
import com.arjunan.springbootmongodb.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/product/list";
    }

    @RequestMapping({"/product/list", "/product"})
    public String listOfProducts(Model model){
        model.addAttribute("products",productService.listAll());
        return "product/list";
    }

    @RequestMapping("/product/new")
    public String saveProduct(Model model){
        model.addAttribute("productForm", new ProductDto());
        return "product/productForm";
    }
}
