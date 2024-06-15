package org.example.assshoes.controller;


import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.assshoes.service.impl.ShoeDetailService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class homeController {
    ShoeDetailService shoeDetailService;


    @GetMapping("")
    public String index(Model model) {
        Pageable pageable = PageRequest.of(0, 8);
        model.addAttribute("page", shoeDetailService.getAllShoeDetails(pageable));
        return "home/index";
    }

    @GetMapping("/about")
    public String about() {
        return "home/about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "home/contact";
    }

    @GetMapping("/shopping")
    public String shopping(Model model) {
        Pageable pageable = PageRequest.of(0, 9);
        model.addAttribute("page", shoeDetailService.getAllShoeDetails(pageable));
        model.addAttribute("totalPage", shoeDetailService.getAllShoeDetails(pageable).getTotalPages());
        return "home/shopping";
    }
}
