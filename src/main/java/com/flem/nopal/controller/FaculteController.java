package com.flem.nopal.controller;

import com.flem.nopal.model.Faculte;
import com.flem.nopal.repository.FaculteRepository;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FaculteController {

    @Autowired
    FaculteRepository faculteRepository ;

    @PostMapping("/add-faculte")
    public Faculte addFaculte(@RequestBody Faculte faculte) {
        return faculteRepository.save(faculte) ;
    }

    @GetMapping("/list-faculte")
    public List<Faculte> listFaculte(){
        return (List<Faculte>) faculteRepository.findAll();
    }

    @PutMapping("/update-faculte")
    public void updateFaculte(@PathVariable int id ,@RequestBody Faculte faculte) {
        faculte.setId(id);
        faculteRepository.save(faculte);
    }

    @DeleteMapping("/delete-faculte/{id}")
    public List<Faculte> deleteFaculte(@PathVariable int id) {
        faculteRepository.deleteById(id) ;
        return (List<Faculte>) faculteRepository.findAll();
    }
}
