package com.intellipath.repo;

import com.intellipath.model.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssessmentRepository extends JpaRepository<Assessment, Long> {

    List<Assessment> findByCategory(String category);

    List<Assessment> findByStudents_Id(Long studentId);

    List<Assessment> findByCourse_Id(Long courseId);
}
