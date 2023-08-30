package com.FranciscoLG.demo.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DomicilioBi implements  Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long domicilioBiid;

    @OneToOne(mappedBy = "domicilioBi", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private PersonaBi personaBi;

}