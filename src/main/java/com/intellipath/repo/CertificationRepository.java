package com.intellipath.repo;

import com.intellipath.model.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Integer> {
    Certification findCertificationById(int id);
    List<Certification> findCertificationByName(String name);
    List<Certification> findCertificationByOrganization(String organization);
    List<Certification> findCertificationByValidity(String validity);
    // Add more custom query methods if needed
}
