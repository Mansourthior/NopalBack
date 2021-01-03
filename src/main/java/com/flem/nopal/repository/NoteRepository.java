package com.flem.nopal.repository;

import com.flem.nopal.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note,Integer> {
}
