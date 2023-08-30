package com.um.ejercicio_1.Repositorios;

import com.um.ejercicio_1.Entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Domicilio_repository extends JpaRepository<Domicilio, Long> {
}
