package org.example.assshoes.controller;


import org.example.assshoes.service.impl.CategoryService;
import org.example.assshoes.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Optional;

@Controller
@RequestMapping("/index")
public class homeController {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("/trangchu")
    public String index(Model model) {
        Pageable pageable = PageRequest.of(0, 8);
//        model.addAttribute("countP", Math.ceil((double) productService.getAllProducts().size() / 4));
        model.addAttribute("categories", categoryService.getAllCategories());
        model.addAttribute("page", productService.getAllProducts(pageable));
        model.addAttribute("view","listProduct.jsp");
        return "home/home";
    }
}
