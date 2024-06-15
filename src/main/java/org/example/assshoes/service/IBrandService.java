package org.example.assshoes.service;

import org.example.assshoes.model.Brand;

import java.util.List;

public interface IBrandService {
    public List<Brand> getAllBrands();
    public Brand getBrandById(int id);
    public Brand saveBrand(Brand brand);
    public void deleteBrand(int id);
    public Brand updateBrand(Brand brand);
}
