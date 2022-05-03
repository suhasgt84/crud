package com.app.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.crud.entities.Student;

public interface Studentrepository extends JpaRepository<Student, Long> {

}
