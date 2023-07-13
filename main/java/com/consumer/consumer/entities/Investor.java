package com.consumer.consumer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Investor {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private boolean active;

}
