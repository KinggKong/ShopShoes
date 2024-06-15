package org.example.assshoes.service.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.assshoes.model.Image;
import org.example.assshoes.repository.ImageRepository;
import org.example.assshoes.service.IImageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ImageService implements IImageService {
    ImageRepository imageRepository;

    @Override
    public List<Image> getImagesByShoeDetail(Long shoeDetailID) {
        return imageRepository.findByShoedetailId(shoeDetailID);
    }

    @Override
    public Image getImage(Long id) {
        return null;
    }

    @Override
    public void addImage(Image image) {

    }

    @Override
    public void removeImage(int id) {

    }

    @Override
    public void updateImage(Image image) {

    }
}
