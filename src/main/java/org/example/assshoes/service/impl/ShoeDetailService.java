package org.example.assshoes.service.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.assshoes.dto.response.ShoeViewDTO;
import org.example.assshoes.model.Image;
import org.example.assshoes.model.ShoeDetail;
import org.example.assshoes.model.Size;
import org.example.assshoes.repository.ImageRepository;
import org.example.assshoes.repository.ShoeDetailRepository;
import org.example.assshoes.service.IShoeDetailService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ShoeDetailService implements IShoeDetailService {
    ShoeDetailRepository shoeDetailRepository;
    ImageRepository imageRepository;

    @Override
    public ShoeDetail getShoeDetail(Long id) {
        return shoeDetailRepository.findById(id).orElse(null);
    }

    @Override
    public ShoeDetail createShoeDetail(ShoeDetail shoeDetail) {
        return null;
    }

    @Override
    public Page<ShoeViewDTO> getAllShoeDetails(Pageable pageable) {
        Page<ShoeDetail> shoeDetailsPage = shoeDetailRepository.findAll(pageable);
        List<ShoeDetail> shoeDetails = shoeDetailsPage.getContent();
        List<ShoeViewDTO> shoeViewDTOs = new ArrayList<>();

        for (ShoeDetail shoeDetail : shoeDetails) {
            ShoeViewDTO shoeViewDTO = ShoeViewDTO.fromShoeDetail(shoeDetail);
            Optional<Image> imageOptional = imageRepository.findByShoedetailIdAndMainimageExists(shoeDetail.getId());
            if (imageOptional.isPresent()) {
                shoeViewDTO.setThumbnailURL(imageOptional.get().getMainimage());
            } else {
                shoeViewDTO.setThumbnailURL("");
            }
            shoeViewDTOs.add(shoeViewDTO);
        }

        return new PageImpl<>(shoeViewDTOs, pageable, shoeDetailsPage.getTotalElements());
    }

    @Override
    public ShoeDetail updateShoeDetail(ShoeDetail shoeDetail) {
        return null;
    }

    @Override
    public void deleteShoeDetail(int id) {

    }

    @Override
    public Page<ShoeDetail> getAllShoeDetailsByShoeId(int shoeId, Pageable pageable) {
        return null;
    }

    @Override
    public Page<ShoeDetail> getAllShoeDetailsByColorId(int colorId, Pageable pageable) {
        return null;
    }

    @Override
    public Page<ShoeDetail> getAllShoeDetailsBySizeId(int sizeId, Pageable pageable) {
        return null;
    }

}
