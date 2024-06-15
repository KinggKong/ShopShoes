package org.example.assshoes.service;

import org.example.assshoes.model.Color;

import java.util.List;

public interface IColorService {
    List<Color> getColors();

    Color getColorById(int id);

    void addColor(Color color);

    void removeColor(int id);

    void updateColor(Color color);
}
