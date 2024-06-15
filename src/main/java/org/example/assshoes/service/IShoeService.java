package org.example.assshoes.service;

import org.example.assshoes.model.Brand;
import org.example.assshoes.model.Category;
import org.example.assshoes.model.Shoe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IShoeService {
    Shoe createShoe(Shoe shoe);
    Page<Shoe> getAllShoes(Pageable pageable);
    Shoe getShoe(int id);
    Shoe updateShoe(Shoe shoe);
    void deleteShoe(int id);
    Page<Shoe> getShoesByCategory(Category category, Pageable pageable);
    Page<Shoe> getShoesByBrand(Brand brand, Pageable pageable);

}
