package com.intellipath.controller;

import com.intellipath.model.Career;
import com.intellipath.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/careers")
public class CareerController {
    private final CareerService careerService;

    @Autowired
    public CareerController(CareerService careerService) {
        this.careerService = careerService;
    }

    @GetMapping
    public List<Career> getAllCareers() {
        return careerService.getAllCareers();
    }

    @GetMapping("/{id}")
    public Career getCareerById(@PathVariable int id) {
        return careerService.getCareerById(id);
    }

    @PostMapping
    public void addCareer(@RequestBody Career career) {
        careerService.addCareer(career);
    }

    @PutMapping("/{id}")
    public void updateCareer(@PathVariable int id, @RequestBody Career career) {
        career.setId(id);
        careerService.updateCareer(career);
    }

    @DeleteMapping("/{id}")
    public void deleteCareer(@PathVariable int id) {
        careerService.deleteCareer(id);
    }
}
