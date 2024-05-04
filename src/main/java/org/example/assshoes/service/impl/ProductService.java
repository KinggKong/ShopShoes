package org.example.assshoes.service.impl;

import org.example.assshoes.dto.ProductDTO;
import org.example.assshoes.model.Category;
import org.example.assshoes.model.Product;
import org.example.assshoes.repository.ProductRepository;
import org.example.assshoes.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product createProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public Page<Product> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product udpateProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public void deleteProduct(Long productID) {

    }

    @Override
    public Page<Product> getAllProductsByCategory(Category category, Pageable pageable) {
        return productRepository.findByCategory(category,pageable);
    }


}
