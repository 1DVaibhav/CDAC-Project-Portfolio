package com.intellipath.service;

import com.intellipath.model.Certification;
import com.intellipath.repo.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationService {
    private final CertificationRepository certificationRepository;

    @Autowired
    public CertificationService(CertificationRepository certificationRepository) {
        this.certificationRepository = certificationRepository;
    }

    public Certification getCertificationById(int id) {
        return certificationRepository.findCertificationById(id);
    }

    public List<Certification> getAllCertifications() {
        return certificationRepository.findAll();
    }

    public void addCertification(Certification certification) {
        certificationRepository.save(certification);
    }

    public void updateCertification(Certification certification) {
        certificationRepository.save(certification);
    }

    public void deleteCertification(int id) {
        certificationRepository.deleteById(id);
    }
}
