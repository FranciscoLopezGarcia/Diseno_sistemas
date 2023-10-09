package com.example.demo.services;

import com.example.demo.entities.Localidad;
import com.example.demo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Localidad> findALL() throws Exception {
        return null;
    }

    @Override
    public Localidad findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Localidad save(Localidad entity) throws Exception {
        return null;
    }

    @Override
    public Localidad update(Long aLong, Localidad entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
