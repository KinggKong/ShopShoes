package org.example.assshoes.controller;

import org.example.assshoes.model.Category;
import org.example.assshoes.model.Product;
import org.example.assshoes.service.impl.CategoryService;
import org.example.assshoes.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public String index(@PathVariable("id") Long id, Model model){
        Pageable pageable = PageRequest.of(0,8);
        Category category = categoryService.findById(id);
        Page<Product> page = productService.getAllProductsByCategory(category,pageable);
        model.addAttribute("page",page);
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories",categories);
        model.addAttribute("view","listProduct.jsp");
        return "home/home";
    }
}
