package com.example.doseo_rent.dao;

import com.example.rent.entity.Rent;

import java.util.List;

public interface RentDAO {

    void updateStatus(Long rentId, String status);
    List<Rent> findAll();
}
