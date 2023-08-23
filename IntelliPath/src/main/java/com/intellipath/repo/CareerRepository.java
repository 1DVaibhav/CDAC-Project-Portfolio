package com.intellipath.repo;

import com.intellipath.model.Career;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CareerRepository {
    private List<Career> careers;

    public CareerRepository() {
        careers = new ArrayList<>();
    }

    public List<Career> getAllCareers() {
        return careers;
    }

    public Career getCareerById(int id) {
        for (Career career : careers) {
            if (career.getId() == id) {
                return career;
            }
        }
        return null;
    }

    public void addCareer(Career career) {
        careers.add(career);
    }

    public void updateCareer(Career career) {
        Career existingCareer = getCareerById(career.getId());
        if (existingCareer != null) {
            existingCareer.setTitle(career.getTitle());
            existingCareer.setDescription(career.getDescription());
            existingCareer.setSalary(career.getSalary());
        }
    }

    public void deleteCareer(int id) {
        Career careerToDelete = getCareerById(id);
        if (careerToDelete != null) {
            careers.remove(careerToDelete);
        }
    }
}
