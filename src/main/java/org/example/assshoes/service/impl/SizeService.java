package org.example.assshoes.service.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.assshoes.model.Size;
import org.example.assshoes.repository.SizeRepository;
import org.example.assshoes.service.ISizeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SizeService implements ISizeService {
    SizeRepository sizeRepository;

    @Override
    public List<Size> getSizeList() {
        return sizeRepository.findAll();
    }

    @Override
    public List<Size> getAllSizeByShoeDetailCode(String code) {
        return sizeRepository.findAllByShoeDetailCode(code);
    }

    @Override
    public void addSize(Size size) {
        sizeRepository.save(size);
    }

    @Override
    public void removeSize(Size size) {
        sizeRepository.delete(size);
    }

    @Override
    public void updateSize(Size size) {
        sizeRepository.save(size);
    }

}
