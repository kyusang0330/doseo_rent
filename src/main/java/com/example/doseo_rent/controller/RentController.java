package com.example.doseo_rent.controller;

import com.example.rent.dto.RentResponseDTO;
import com.example.rent.service.RentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rent")
@AllArgsConstructor
public class RentController {
    private final RentServiceImpl rentService;

    @PostMapping("/update/{rentId}")
    public String updateStatus(@PathVariable Long rentId, @RequestParam("rentstatus") String status) {
//        String lockYn = "HIDE".equals(usedYn) ? "N" : "Y";
        rentService.updateStatus(rentId, status);

        return "Rent updated successfully!update update upupupupup";
    }

    @GetMapping("/list")
    public List<RentResponseDTO> findAll() {
        return rentService.findAll();
    }
}
