package org.example.assshoes.service;

import org.example.assshoes.model.Size;

import java.util.List;

public interface ISizeService {
    List<Size> getSizeList();

    List<Size> getAllSizeByShoeDetailCode(String code);

    void addSize(Size size);

    void removeSize(Size size);

    void updateSize(Size size);
}
