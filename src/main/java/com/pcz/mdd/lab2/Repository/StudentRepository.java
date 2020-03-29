package com.pcz.mdd.lab2.Repository;

import com.pcz.mdd.lab2.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
