package com.FranciscoLG.demo.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PersonaBi implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idPersonaBi;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "domicilioiid")
    private DomicilioBi domicilioBi;
}
