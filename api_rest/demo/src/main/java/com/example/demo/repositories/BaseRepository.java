package com.example.demo.repositories;


import com.example.demo.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.yaml.snakeyaml.events.Event;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <E extends Base, Id extends Serializable> extends JpaRepository<E, Event.ID>{
}
