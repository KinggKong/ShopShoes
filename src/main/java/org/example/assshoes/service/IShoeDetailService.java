package org.example.assshoes.service;

import org.example.assshoes.dto.response.ShoeViewDTO;
import org.example.assshoes.model.ShoeDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IShoeDetailService {
    ShoeDetail getShoeDetail(Long id);
    ShoeDetail createShoeDetail(ShoeDetail shoeDetail);
    Page<ShoeViewDTO> getAllShoeDetails(Pageable pageable);
    ShoeDetail updateShoeDetail(ShoeDetail shoeDetail);
    void deleteShoeDetail(int id);
    Page<ShoeDetail> getAllShoeDetailsByShoeId(int shoeId,Pageable pageable);
    Page<ShoeDetail> getAllShoeDetailsByColorId(int colorId,Pageable pageable);
    Page<ShoeDetail> getAllShoeDetailsBySizeId(int sizeId,Pageable pageable);
}
