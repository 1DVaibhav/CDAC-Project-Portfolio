package com.intellipath.repo;

import com.intellipath.model.Industry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndustryRepository extends JpaRepository<Industry, Integer> {
    List<Industry> findByLocation(String location);

    List<Industry> findByDescriptionContaining(String keyword);

    // Add more custom query methods as needed
}
