package com.intellipath.service;

import com.intellipath.model.Assessment;
import com.intellipath.repo.AssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentService {
    private final AssessmentRepository assessmentRepository;

    @Autowired
    public AssessmentService(AssessmentRepository assessmentRepository) {
        this.assessmentRepository = assessmentRepository;
    }

    public Assessment getById(Long id) {
        return assessmentRepository.getById(id);
    }

    public void save(Assessment assessment) {
        assessmentRepository.save(assessment);
    }

    public void delete(Long id) {
        assessmentRepository.deleteById(id);
    }

    public List<Assessment> getAllAssessments() {
        return assessmentRepository.findAll();
    }

    // Add more methods or business logic as needed
}
