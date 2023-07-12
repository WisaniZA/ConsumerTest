package com.consumer.consumer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
    private Long id;
    private String name;
    private Product type;
    private Double balance;
    @ManyToOne
    @JoinColumn(name = "investor_id")
    private Investor investor;
}
