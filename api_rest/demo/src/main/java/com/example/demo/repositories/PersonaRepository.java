package com.example.demo.repositories;

import com.example.demo.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    boolean ExistsByDni(String dni);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%'")
    List<Persona> search(String filtro);

}

