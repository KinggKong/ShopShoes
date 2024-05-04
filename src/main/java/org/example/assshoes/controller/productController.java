package org.example.assshoes.controller;

import org.example.assshoes.model.Category;
import org.example.assshoes.service.impl.CategoryService;
import org.example.assshoes.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class productController {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("/detail/{id}")
    public String productDetail(Model model, @PathVariable("id") Long id) {
        model.addAttribute("item", productService.findById(id));
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories",categories);
        model.addAttribute("view","detailProduct.jsp");
        return "home/home";
    }
}
