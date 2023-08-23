package com.intellipath.controller;

import com.intellipath.model.Certification;
import com.intellipath.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/certifications")
public class CertificationController {
    private final CertificationService certificationService;

    @Autowired
    public CertificationController(CertificationService certificationService) {
        this.certificationService = certificationService;
    }

    @GetMapping("/{id}")
    public Certification getCertificationById(@PathVariable int id) {
        return certificationService.getCertificationById(id);
    }

    @GetMapping
    public List<Certification> getAllCertifications() {
        return certificationService.getAllCertifications();
    }

    @PostMapping
    public void addCertification(@RequestBody Certification certification) {
        certificationService.addCertification(certification);
    }

    @PutMapping("/{id}")
    public void updateCertification(@PathVariable int id, @RequestBody Certification certification) {
        certification.setId(id);
        certificationService.updateCertification(certification);
    }

    @DeleteMapping("/{id}")
    public void deleteCertification(@PathVariable int id) {
        certificationService.deleteCertification(id);
    }
}
