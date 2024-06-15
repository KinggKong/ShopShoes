package org.example.assshoes.service;

import org.example.assshoes.model.Image;

import java.util.List;

public interface IImageService {
    List<Image> getImagesByShoeDetail(Long shoeDetailID);

    Image getImage(Long id);

    void addImage(Image image);

    void removeImage(int id);

    void updateImage(Image image);

}
