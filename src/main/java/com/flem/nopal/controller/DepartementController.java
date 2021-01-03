package com.flem.nopal.controller;

import com.flem.nopal.model.Departement;
import com.flem.nopal.repository.DepartementRepository;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DepartementController {

    @Autowired
    DepartementRepository departementRepository ;

    @PostMapping("/add-departement")
    public Departement addDepartement(@RequestBody Departement departement) {
        return departementRepository.save(departement) ;
    }

    @GetMapping("/list-departement")
    public List<Departement> listDepartement(){
        return (List<Departement>) departementRepository.findAll();
    }

    @PutMapping("/update-departement")
    public void updateDepartement(@PathVariable int id ,@RequestBody Departement departement) {
        departement.setId(id);
        departementRepository.save(departement);
    }

    @DeleteMapping("/delete-departement/{id}")
    public List<Departement> deleteDepartement(@PathVariable int id) {
        departementRepository.deleteById(id) ;
        return (List<Departement>) departementRepository.findAll();
    }
}
