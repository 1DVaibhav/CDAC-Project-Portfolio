package com.intellipath.controller;

import com.intellipath.model.Internship;
import com.intellipath.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/internships")
public class InternshipController {
    private final InternshipService internshipService;

    @Autowired
    public InternshipController(InternshipService internshipService) {
        this.internshipService = internshipService;
    }

    @GetMapping("/")
    public List<Internship> getAllInternships() {
        return internshipService.getAllInternships();
    }

    @GetMapping("/{id}")
    public Internship getInternshipById(@PathVariable int id) {
        return internshipService.getInternshipById(id);
    }

    @PostMapping("/")
    public void addInternship(@RequestBody Internship internship) {
        internshipService.addInternship(internship);
    }

    @PutMapping("/{id}")
    public void updateInternship(@PathVariable int id, @RequestBody Internship internship) {
        internship.setId(id);
        internshipService.updateInternship(internship);
    }

    @DeleteMapping("/{id}")
    public void deleteInternship(@PathVariable int id) {
        internshipService.deleteInternship(id);
    }
}
