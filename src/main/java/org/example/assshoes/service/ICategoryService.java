package org.example.assshoes.service;

import org.example.assshoes.dto.CategoryDTO;
import org.example.assshoes.model.Category;

import java.util.List;

public interface ICategoryService {
    Category createCategory(CategoryDTO categoryDTO);

    List<Category> getAllCategories();

    Category updateCategory(CategoryDTO categoryDTO);

    void deleteCategory(Long categoryID);

    Category findById(Long id);
}
