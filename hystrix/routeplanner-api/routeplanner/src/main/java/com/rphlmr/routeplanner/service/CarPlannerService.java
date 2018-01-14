package com.rphlmr.routeplanner.service;

import com.rphlmr.routeplanner.httpclient.CarPlannerHandler;
import com.rphlmr.routeplanner.model.CarPlan;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
@Service
public class CarPlannerService {

    private final CarPlannerHandler carPlannerHandler;

    public CarPlannerService(CarPlannerHandler carPlannerHandler) {
        this.carPlannerHandler = carPlannerHandler;
    }

    public CarPlan findCarPlanFor(final String departureCity, final String arrivalCity,
        final String departureDate) {
        return carPlannerHandler.findCarPlanFor(departureCity, arrivalCity, LocalDateTime.parse(departureDate));
    }
}
