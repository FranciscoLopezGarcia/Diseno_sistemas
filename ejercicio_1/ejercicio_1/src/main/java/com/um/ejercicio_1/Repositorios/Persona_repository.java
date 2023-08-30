package com.um.ejercicio_1.Repositorios;

import com.um.ejercicio_1.Entidades.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Persona_repository extends JpaRepository<Persona, Long> {
};

