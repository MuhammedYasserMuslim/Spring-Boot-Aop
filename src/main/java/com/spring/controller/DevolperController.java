package com.spring.controller;

import com.spring.model.Devolper;
import com.spring.services.DevolperServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Validated
@RestController
@RequestMapping("/devolper")
public class DevolperController {

    @Autowired
    DevolperServices devolperServices;


    @GetMapping("/count")
    public long count() {
        return devolperServices.count();
    }

    @GetMapping("/devolpers")
    public List<Devolper> findAll() {
        return devolperServices.findAll();
    }

    @GetMapping("/devolper")
    public Optional<Devolper> findById(@RequestParam Byte id) {
        return devolperServices.findById(id);
    }

    @PostMapping("/devolpers")
    public Devolper save(@RequestBody @Valid Devolper devolper) {
        devolperServices.insert(devolper);
        return devolper;
    }

    @PutMapping("/devolpers")
    public Devolper update(@RequestBody @Valid Devolper devolper ) {
        devolperServices.insert(devolper);
        return devolper;
    }

    @DeleteMapping("/devolper")
    public Devolper deleteById(@RequestParam Byte id) {
        Devolper devolper;
        devolper = devolperServices.findById(id).get();
        devolperServices.deleteById(id);
        return devolper;
    }
}
