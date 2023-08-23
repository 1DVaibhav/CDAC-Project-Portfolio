package com.intellipath.repo;

import com.intellipath.model.Scholarship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScholarshipRepository extends JpaRepository<Scholarship, Integer> {

    List<Scholarship> findByProvider(String provider);

    List<Scholarship> findByAmountGreaterThan(double amount);

    List<Scholarship> findByProviderAndAmountGreaterThan(String provider, double amount);

    // You can add more custom query methods here if needed

}
