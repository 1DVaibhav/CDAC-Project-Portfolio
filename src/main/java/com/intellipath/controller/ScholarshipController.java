package com.intellipath.controller;

import com.intellipath.model.Scholarship;
import com.intellipath.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scholarships")
public class ScholarshipController {
    private final ScholarshipService scholarshipService;

    @Autowired
    public ScholarshipController(ScholarshipService scholarshipService) {
        this.scholarshipService = scholarshipService;
    }

    @GetMapping
    public List<Scholarship> getAllScholarships() {
        return scholarshipService.getAllScholarships();
    }

    @GetMapping("/{id}")
    public Scholarship getScholarshipById(@PathVariable int id) {
        return scholarshipService.getScholarshipById(id);
    }

    @PostMapping
    public void addScholarship(@RequestBody Scholarship scholarship) {
        scholarshipService.addScholarship(scholarship);
    }

    @PutMapping("/{id}")
    public void updateScholarship(@PathVariable int id, @RequestBody Scholarship scholarship) {
        scholarship.setId(id);
        scholarshipService.updateScholarship(scholarship);
    }

    @DeleteMapping("/{id}")
    public void deleteScholarship(@PathVariable int id) {
        scholarshipService.deleteScholarship(id);
    }
}
