package com.studentmgtsystem1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentmgtsystem1.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
