package com.example.doseo_rent.service;

import com.example.rent.dto.RentResponseDTO;

import java.util.List;

public interface RentService {

    void updateStatus(Long rentId, String status);
    List<RentResponseDTO> findAll() ;
}
