package com.flem.nopal.controller;

import com.flem.nopal.model.Ue;
import com.flem.nopal.repository.UERepository;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UEController {

    @Autowired
    UERepository UERepository ;

    @PostMapping("/add-ue")
    public Ue addUe(@RequestBody Ue ue) {
        return UERepository.save(ue) ;
    }

    @GetMapping("/list-ue")
    public List<Ue> listUe(){
        return (List<Ue>) UERepository.findAll();
    }

    @PutMapping("/update-ue")
    public void updateUe(@PathVariable int id ,@RequestBody Ue ue) {
        ue.setId(id);
        UERepository.save(ue);
    }

    @DeleteMapping("/delete-ue/{id}")
    public List<Ue> deleteUe(@PathVariable int id) {
        UERepository.deleteById(id) ;
        return (List<Ue>) UERepository.findAll();
    }
}
