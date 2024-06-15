package org.example.assshoes.service.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.assshoes.model.Color;
import org.example.assshoes.repository.ColorRepository;
import org.example.assshoes.service.IColorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ColorService implements IColorService {
    ColorRepository repository;

    @Override
    public List<Color> getColors() {
        return repository.findAll();
    }

    @Override
    public Color getColorById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void addColor(Color color) {
        repository.save(color);
    }

    @Override
    public void removeColor(int id) {
        repository.deleteById(id);
    }

    @Override
    public void updateColor(Color color) {
        repository.save(color);
    }
}
