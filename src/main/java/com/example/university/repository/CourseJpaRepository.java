package com.example.university.repository;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.university.model.*;


@Repository
public interface CourseJpaRepository extends JpaRepository<Course, Integer> {
  List<Course> findByProfessor(Professor professor);
}