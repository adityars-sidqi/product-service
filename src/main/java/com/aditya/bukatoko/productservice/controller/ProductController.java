package com.aditya.bukatoko.productservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.bukatoko.productservice.entity.Product;
import com.aditya.bukatoko.productservice.dto.ProductDTO;
import com.aditya.bukatoko.productservice.exception.NotFoundException;
import com.aditya.bukatoko.productservice.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {
  
  	@Autowired
	private ProductService productService;

	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		log.info("INSERT CATEGORY");
		return productService.save(product);
	}

	@GetMapping("/{id}")
	public Optional<ProductDTO> getProduct(@PathVariable Long id) {
		Optional<ProductDTO> product = productService.findById(id);
		if (!product.isPresent())
			throw new NotFoundException("Not found id-" + id);
		return product;
	}

	@GetMapping
	public Page<ProductDTO> getProduct(Pageable pageable) {
		return productService.findAll(pageable);
	}

  
}
