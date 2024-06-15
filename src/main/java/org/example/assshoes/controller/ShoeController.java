package org.example.assshoes.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.assshoes.model.Image;
import org.example.assshoes.model.ShoeDetail;
import org.example.assshoes.service.impl.ImageService;
import org.example.assshoes.service.impl.ShoeDetailService;
import org.example.assshoes.service.impl.SizeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shoes")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ShoeController {
    ShoeDetailService shoeDetailService;
    ImageService imageService;
    SizeService sizeService;


    @GetMapping("/{id}")
    public String shoeDetail(@PathVariable Long id, Model model) {
        ShoeDetail shoeDetail = shoeDetailService.getShoeDetail(id);
        model.addAttribute("shoeDetail", shoeDetail);
        model.addAttribute("imagesShoeDetail", imageService.getImagesByShoeDetail(id));
        model.addAttribute("sizes", sizeService.getAllSizeByShoeDetailCode(shoeDetail.getCode()));
        return "home/productDetail";
    }


}
