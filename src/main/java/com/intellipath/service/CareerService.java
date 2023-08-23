package com.intellipath.service;

import com.intellipath.model.Career;
import com.intellipath.repo.CareerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareerService {
    private final CareerRepository careerRepository;

    @Autowired
    public CareerService(CareerRepository careerRepository) {
        this.careerRepository = careerRepository;
    }

    public List<Career> getAllCareers() {
        return careerRepository.getAllCareers();
    }

    public Career getCareerById(int careerId) {
        return careerRepository.getCareerById(careerId);
    }

    public void addCareer(Career career) {
        careerRepository.addCareer(career);
    }

    public void updateCareer(Career career) {
        careerRepository.updateCareer(career);
    }

    public void deleteCareer(int careerId) {
        careerRepository.deleteCareer(careerId);
    }
}
