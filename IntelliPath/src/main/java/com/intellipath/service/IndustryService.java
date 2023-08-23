package com.intellipath.service;

import com.intellipath.model.Industry;
import com.intellipath.repo.IndustryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndustryService {
    private final IndustryRepository industryRepository;

    @Autowired
    public IndustryService(IndustryRepository industryRepository) {
        this.industryRepository = industryRepository;
    }

    public List<Industry> getAllIndustries() {
        return industryRepository.findAll();
    }

    public Industry getIndustryById(int id) {
        return industryRepository.findById(id).orElse(null);
    }

    public Industry addIndustry(Industry industry) {
        return industryRepository.save(industry);
    }

    public Industry updateIndustry(Industry industry) {
        return industryRepository.save(industry);
    }

    public void deleteIndustry(int id) {
        industryRepository.deleteById(id);
    }
}
