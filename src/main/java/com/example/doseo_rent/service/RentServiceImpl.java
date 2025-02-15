package com.example.doseo_rent.service;

import com.example.doseo_rent.dao.RentDAOImpl;
import com.example.doseo_rent.dto.RentResponseDTO;
import com.example.doseo_rent.entity.Rent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentServiceImpl implements RentService {
    private final RentDAOImpl rentDAO;

    @Override
    public void updateStatus(Long rentId, String status) {
        rentDAO.updateStatus(rentId, status);
    }
    @Override
    public List<RentResponseDTO> findAll() {
        List<Rent> rents = rentDAO.findAll();
        List<RentResponseDTO> rentlist = new ArrayList<>();
        RentResponseDTO rentdto = null;
        for (Rent rent : rents) {
            rentdto = new RentResponseDTO(rent.getRentDate(),rent.getReturnDate(),rent.getState(),
                                        rent.getArticleId(),rent.getBorrowerId());
            rentlist.add(rentdto);
        }
        return rentlist;
    }

}
