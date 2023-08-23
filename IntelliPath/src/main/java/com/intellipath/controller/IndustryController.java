package com.intellipath.controller;

import com.intellipath.model.Industry;
import com.intellipath.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/industries")
public class IndustryController {
    private final IndustryService industryService;

    @Autowired
    public IndustryController(IndustryService industryService) {
        this.industryService = industryService;
    }

    @GetMapping("/")
    public List<Industry> getAllIndustries() {
        return industryService.getAllIndustries();
    }

    @GetMapping("/{id}")
    public Industry getIndustryById(@PathVariable int id) {
        return industryService.getIndustryById(id);
    }

    @PostMapping("/")
    public Industry addIndustry(@RequestBody Industry industry) {
        return industryService.addIndustry(industry);
    }

    @PutMapping("/{id}")
    public Industry updateIndustry(@PathVariable int id, @RequestBody Industry industry) {
        industry.setId(id);
        return industryService.updateIndustry(industry);
    }

    @DeleteMapping("/{id}")
    public void deleteIndustry(@PathVariable int id) {
        industryService.deleteIndustry(id);
    }
}
