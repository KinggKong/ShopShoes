package org.example.assshoes.controller;


import jakarta.validation.Valid;
import org.example.assshoes.dto.ApiResponse;
import org.example.assshoes.dto.UserDTO;
import org.example.assshoes.model.Category;
import org.example.assshoes.model.Product;
import org.example.assshoes.model.User;
import org.example.assshoes.service.IUserService;
import org.example.assshoes.service.impl.CategoryService;
import org.example.assshoes.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("/login")
    public String login() {
        return "login/login";
    }

    @PostMapping("/login")
    public String postLogin(Model model, @RequestParam("un") String username, @RequestParam("pw") String password, @RequestParam(value = "remember", required = false) Boolean remember) {
        User loginUser = userService.login(username, password);
        if (loginUser != null) {
//            List<Product> listProduct = productService.getAllProducts();
//            model.addAttribute("listProduct",listProduct);
//            List<Category> categories = categoryService.getAllCategories();
//            model.addAttribute("categories",categories);
            return "redirect:/index/trangchu";
        }
        return "login/login";
    }

    @PostMapping("/register")
    ApiResponse<User> createUser(@RequestBody @Valid UserDTO userDTO) {
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.createUser(userDTO));
        return apiResponse;
    }
}
