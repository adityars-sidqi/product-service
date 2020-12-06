package com.aditya.bukatoko.productservice.dto;

import com.aditya.bukatoko.productservice.pojo.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
	
	private Long id;
	private String name;
	private int stock;
	private Category category;
	
}
