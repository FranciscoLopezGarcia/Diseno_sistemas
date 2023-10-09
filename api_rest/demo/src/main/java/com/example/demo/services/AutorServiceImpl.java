package com.example.demo.services;

import com.example.demo.entities.Autor;
import com.example.demo.repositories.AutorRepository;
import com.example.demo.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Autor> findALL() throws Exception {
        return null;
    }

    @Override
    public Autor findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Autor save(Autor entity) throws Exception {
        return null;
    }

    @Override
    public Autor update(Long aLong, Autor entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
