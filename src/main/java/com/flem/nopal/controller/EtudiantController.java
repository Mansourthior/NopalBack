package com.flem.nopal.controller;

import com.flem.nopal.model.Classe;
import com.flem.nopal.model.Etudiant;
import com.flem.nopal.repository.EtudiantRepository;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EtudiantController {

    @Autowired
    EtudiantRepository etudiantRepository ;

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantRepository.save(etudiant) ;
    }

    @GetMapping("/list-etudiant")
    public List<Etudiant> listEtudiant(){
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    @PutMapping("/update-etudiant")
    public void updateEtudiant(@PathVariable int id ,@RequestBody Etudiant etudiant) {
        etudiant.setId(id);
        etudiantRepository.save(etudiant);
    }

    @DeleteMapping("/delete-etudiant/{id}")
    public List<Etudiant> deleteEtudiant(@PathVariable int id) {
        etudiantRepository.deleteById(id) ;
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    @PostMapping("/find-etudiant-by-classe")
    public List<Etudiant> findByLinkedClasse(@RequestBody Classe classe) {
        return etudiantRepository.findByLinkedClasse(classe) ;
    }
}
