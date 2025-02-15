package com.example.doseo_rent.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "rent")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentId;
    @CreationTimestamp
    private Date rentDate;
    @UpdateTimestamp
    private Date returnDate;
    private String state;
    private Long articleId;
    private Long borrowerId;

    public Rent(String state, Long articleId, Long borrowerId) {
        this.state = state;
        this.articleId = articleId;
        this.borrowerId = borrowerId;
    }

    public void setStatus(String status) {
    }
}
