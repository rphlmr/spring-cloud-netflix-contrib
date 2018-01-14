package com.rphlmr.carplanner.service;

import com.rphlmr.carplanner.model.CarPlan;
import com.rphlmr.carplanner.repository.CarPlannerRepository;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
@Service
public class CarPlannerService {

    private final CarPlannerRepository carPlannerRepository;

    public CarPlannerService(CarPlannerRepository carPlannerRepository) {
        this.carPlannerRepository = carPlannerRepository;
    }

    public CarPlan findCarPlanFor(final String departureCity, final String arrivalCity,
        final LocalDateTime departureDate) {

        return carPlannerRepository.findCarPlanFor(departureCity, arrivalCity, departureDate);
    }
}
