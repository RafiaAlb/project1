package com.eif.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eif.data.*;
import com.eif.service.ProdectService;

@RestController
public class productController {
@Autowired
private ProdectService ps ;

@GetMapping("/products")
public List<Product> FindAllProducts(){
	return ps.getProducts();
}

//add product to the db
@RequestMapping(method = RequestMethod.GET,value="/addproduct")
public void AddProduct(@RequestBody Product p) {
    	ps.saveProduct(p);
}

@GetMapping("/products/{Id}")
public Product findbyId(@PathVariable int Id) {
	return ps.getbyId(Id);
}


public void deletebyID (@PathVariable int Id) {
	ps.delete(Id);
}



}