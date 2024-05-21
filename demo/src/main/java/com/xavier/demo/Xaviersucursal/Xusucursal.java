package com.xavier.demo.Xaviersucursal;

import java.time.LocalDate;

import com.xavier.demo.Xavierempresa.Xuempresa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Xusucursal {
    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
// Los 4 tipos de datos 
    private long id;
    private String name;         
    private int numeroEmpleados; 
    private LocalDate fechaApertura; 
    private boolean activa;    
 // Relacion muchos a uno porque es la entidad hija
    @ManyToOne
    private Xuempresa xuempresa;
}
