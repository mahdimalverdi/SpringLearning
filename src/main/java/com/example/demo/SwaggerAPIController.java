package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerAPIController {
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<String> getProducts() {
        List<String> productsList = new ArrayList<>();
        productsList.add("Honey");
        productsList.add("Almond");
        return productsList;
    }
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String createProduct() {
        return "Product is saved successfully";
    }
    @RequestMapping(value = "/products2", method = RequestMethod.GET)
    public List<Product> getProducts2() {
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product("سیب"));
        productsList.add(new Product("پرتقال"));
        return productsList;
    }
}