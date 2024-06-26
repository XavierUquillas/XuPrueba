package com.xavier.demo.Xavierempresa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Xuempresa {
    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private long id;
    private String name;
    private String marca;
}
