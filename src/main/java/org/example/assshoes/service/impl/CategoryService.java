package org.example.assshoes.service.impl;

import org.example.assshoes.dto.CategoryDTO;
import org.example.assshoes.model.Category;
import org.example.assshoes.repository.CategoryRepository;
import org.example.assshoes.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category createCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category updateCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public void deleteCategory(Long categoryID) {

    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
