package com.flem.nopal.repository;

import com.flem.nopal.model.Classe;
import com.flem.nopal.model.Etudiant;
import com.sun.tools.javac.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

    List<Etudiant> findByLinkedClasse(Classe classe) ;
}
