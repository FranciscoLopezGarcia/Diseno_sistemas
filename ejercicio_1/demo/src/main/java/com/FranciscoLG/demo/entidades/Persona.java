package com.FranciscoLG.demo.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.io.Serializable;
@Entity
@NoArgsConstructor
@AllArgsConstructor


public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    @OneToOne
    private Domicilio domicilio;
}
