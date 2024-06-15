package org.example.assshoes.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.assshoes.model.Brand;
import org.example.assshoes.model.Category;
import org.example.assshoes.model.Color;
import org.example.assshoes.model.Size;
import org.example.assshoes.service.impl.BrandService;
import org.example.assshoes.service.impl.CategoryService;
import org.example.assshoes.service.impl.ColorService;
import org.example.assshoes.service.impl.SizeService;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@ControllerAdvice
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GlobalControllerAdvice {
    CategoryService categoryService;
    BrandService brandService;
    SizeService sizeService;
    ColorService colorService;

    @ModelAttribute("categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @ModelAttribute("brands")
    public List<Brand> getAllBrands() {
        return brandService.getAllBrands();
    }

    @ModelAttribute("sizes")
    public List<Size> getAllSizes() {
        return sizeService.getSizeList();
    }

    @ModelAttribute("colors")
    public List<Color> getAllColors() {
        return colorService.getColors();
    }
}
