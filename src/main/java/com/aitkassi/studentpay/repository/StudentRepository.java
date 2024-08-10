package com.aitkassi.studentpay.repository;

import com.aitkassi.studentpay.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String> {
    Student findStudentByCode(String code);
    List<Student> findStudentsByProgramId(String id);
}
