package com.intellipath.service;

import com.intellipath.model.Internship;
import com.intellipath.repo.InternshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipService {
    private final InternshipRepository internshipRepository;

    @Autowired
    public InternshipService(InternshipRepository internshipRepository) {
        this.internshipRepository = internshipRepository;
    }

    public List<Internship> getAllInternships() {
        return internshipRepository.findAll();
    }

    public Internship getInternshipById(int id) {
        return internshipRepository.findById(id).orElse(null);
    }

    public Internship addInternship(Internship internship) {
        return internshipRepository.save(internship);
    }

    public Internship updateInternship(Internship internship) {
        return internshipRepository.save(internship);
    }

    public void deleteInternship(int id) {
        internshipRepository.deleteById(id);
    }
}
