package com.lcmd.orm.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.lcmd.orm.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
