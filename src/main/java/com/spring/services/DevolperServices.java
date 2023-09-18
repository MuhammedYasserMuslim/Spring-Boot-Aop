package com.spring.services;

import com.spring.Repository.DevolperRepository;
import com.spring.model.Devolper;
import com.spring.services.base.BaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DevolperServices implements BaseServices<Devolper, Byte> {

    @Autowired
    DevolperRepository devolperRepository;

    @Override
    public long count() {
        return devolperRepository.count();
    }

    @Override
    public List<Devolper> findAll() {
        return devolperRepository.findAll();
    }

    @Override
    public Optional<Devolper> findById(Byte id) {
        return devolperRepository.findById(id);
    }

    @Override
    public void insert(Devolper devolper) {
        devolperRepository.save(devolper);

    }

    @Override
    public void update(Devolper devolper) {
        devolperRepository.save(devolper);

    }

    @Override
    public void deleteById(Byte id) {
        devolperRepository.deleteById(id);
    }
}
