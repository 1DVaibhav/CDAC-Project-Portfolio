package com.intellipath.repo;

import com.intellipath.model.Internship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InternshipRepository extends JpaRepository<Internship, Integer> {
    List<Internship> findByCompany(String company);
    List<Internship> findByDurationGreaterThan(String duration);
    // Add more custom query methods as needed
}
