package com.arjunan.springbootmongodb.controller;

import com.arjunan.springbootmongodb.domain.Product;
import com.arjunan.springbootmongodb.dto.ProductDto;
import com.arjunan.springbootmongodb.mappers.ProductMapper;
import com.arjunan.springbootmongodb.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    private final ProductService productService;
    private final ProductMapper productMapper;

    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
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

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String saveOrUpdateProduct(ProductDto productDto , BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "product/productForm";
        }

        Product product = productService.saveOrUpdateProductForm(productDto);

        return "redirect:/product/show/" + product.get_id();
    }

    @RequestMapping("/product/show/{id}")
    public String getProductById(@PathVariable String id, Model model){
        model.addAttribute("product", productService.getById(id));
        return "product/show";
    }


}
