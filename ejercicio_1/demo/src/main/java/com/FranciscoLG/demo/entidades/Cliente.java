package com.FranciscoLG.demo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data  // ME crea setters y getters sin la necesidad de codearlos.
@NoArgsConstructor // Constructor vacio
@AllArgsConstructor // Construsctor con todos los valores
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // PK
    private String nombre;
    private String apellido;
    private int edad;

}
