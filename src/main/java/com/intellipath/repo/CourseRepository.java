package com.intellipath.repo;

import com.intellipath.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    List<Course> findByTitleContaining(String keyword);

    List<Course> findByDurationLessThan(int maxDuration);

    List<Course> findByDescriptionContainingIgnoreCase(String keyword);
}
