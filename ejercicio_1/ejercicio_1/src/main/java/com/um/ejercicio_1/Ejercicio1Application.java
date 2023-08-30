package com.um.ejercicio_1;

import com.um.ejercicio_1.Entidades.Domicilio;
import com.um.ejercicio_1.Entidades.Persona;
import com.um.ejercicio_1.Repositorios.Persona_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejercicio1Application {


	@Autowired
	Persona_repository persona_repo;

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
	}
	@Bean
	CommandLineRunner init (Persona_repository persona_repo){
		return args -> {
			System.out.println("---IM WORKING---");
			Persona persona = Persona.builder()
					.name("Juan")
					.lastname("Perez")
					.age("20")
					.build();

			Domicilio domicilio = Domicilio.builder()
					.street("Calle 1")
					.number(123)
					.build();

			persona.setDomicilio(domicilio);
			persona_repo.save(persona);
			Persona persona_id = persona_repo.findById(persona.getId()).orElse(null);
			if (persona_id != null) {
				System.out.println("Nombre: " + persona_id);
			}

			persona_repo.findById(1L).ifPresent(System.out::println;
		};
	};
}
