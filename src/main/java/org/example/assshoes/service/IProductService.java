package org.example.assshoes.service;

import org.example.assshoes.dto.ProductDTO;
import org.example.assshoes.model.Category;
import org.example.assshoes.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Product createProduct(ProductDTO productDTO);

    Page<Product> getAllProducts(Pageable pageable);

    Product findById(Long id);

    Product udpateProduct(ProductDTO productDTO);

    void deleteProduct(Long productID);

    Page<Product> getAllProductsByCategory(Category category, Pageable pageable);
}
