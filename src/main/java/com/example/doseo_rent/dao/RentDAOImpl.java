package com.example.doseo_rent.dao;

import com.example.doseo_rent.entity.Rent;
import com.example.doseo_rent.repository.RentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RentDAOImpl implements RentDAO {
    private final RentRepository rentRepository;

    @Override
    public void updateStatus(Long rentId, String status) {
        Optional<Rent> rentStatus = rentRepository.findById(rentId);
        if (rentStatus.isPresent()) {
            Rent rent = rentStatus.get();
            // 상태 변경
            rent.setStatus(status);
            // 저장 (save 메서드는 Optional로 관리 상태에 따라 자동 처리)
            rentRepository.save(rent);
        }
    }
    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }
}




/*
@Repository
@AllArgsConstructor
public class RentDAOImpl implements RentDAO {
    private final EntityManager em;
    @Override
    public void insert(Rent dto) {
        em.persist(dto);
        em.flush();
    }

    @Override
    public Rent findById(Long id) {
        return em.find(Rent.class, id);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Rent dto) {

    }

    @Override
    public List<Rent> findAll() {
        return List.of();
    }
}
*/
