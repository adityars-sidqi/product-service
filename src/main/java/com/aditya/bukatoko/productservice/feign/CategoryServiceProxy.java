package com.aditya.bukatoko.productservice.feign;

import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.aditya.bukatoko.productservice.pojo.Category;

@FeignClient(name = "category-service")
public interface CategoryServiceProxy {

    @GetMapping("/categories/{id}")
    public Optional<Category> getCategory(@PathVariable Long id);

}

