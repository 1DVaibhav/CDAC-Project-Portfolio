package com.intellipath.service;

import com.intellipath.model.Scholarship;
import com.intellipath.repo.ScholarshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScholarshipService {
    private final ScholarshipRepository scholarshipRepository;

    @Autowired
    public ScholarshipService(ScholarshipRepository scholarshipRepository) {
        this.scholarshipRepository = scholarshipRepository;
    }

    public List<Scholarship> getAllScholarships() {
        return scholarshipRepository.findAll();
    }

    public Scholarship getScholarshipById(int id) {
        return scholarshipRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Scholarship with ID " + id + " does not exist."));
    }

    public void addScholarship(Scholarship scholarship) {
        scholarshipRepository.save(scholarship);
    }

    public void updateScholarship(Scholarship scholarship) {
        if (!scholarshipRepository.existsById(scholarship.getId())) {
            throw new IllegalArgumentException("Scholarship with ID " + scholarship.getId() + " does not exist.");
        }
        scholarshipRepository.save(scholarship);
    }

    public void deleteScholarship(int id) {
        if (!scholarshipRepository.existsById(id)) {
            throw new IllegalArgumentException("Scholarship with ID " + id + " does not exist.");
        }
        scholarshipRepository.deleteById(id);
    }
}
