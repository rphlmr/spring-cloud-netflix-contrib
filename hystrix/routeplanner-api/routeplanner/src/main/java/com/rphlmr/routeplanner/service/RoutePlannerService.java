package com.rphlmr.routeplanner.service;

import com.rphlmr.routeplanner.model.CarPlan;
import com.rphlmr.routeplanner.model.RoutePlan;
import com.rphlmr.routeplanner.model.TrainPlan;
import org.springframework.stereotype.Service;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
@Service
public class RoutePlannerService {

    private final CarPlannerService carPlannerService;
    private final TrainPlannerService trainPlannerService;

    public RoutePlannerService(CarPlannerService carPlannerService,
        TrainPlannerService trainPlannerService) {
        this.carPlannerService = carPlannerService;
        this.trainPlannerService = trainPlannerService;
    }


    public RoutePlan findRoutePlanFor(final String departureCity, final String arrivalCity,
        final String departureDate) {

        CarPlan carPlan = carPlannerService.findCarPlanFor(departureCity, arrivalCity, departureDate);
        TrainPlan trainPlan = trainPlannerService.findTrainPlanFor(departureCity, arrivalCity, departureDate);

        return new RoutePlan()
            .setPlanId(carPlan.getPlanId() + "::" + trainPlan.getPlanId())
            .setDepartureDateWishes(departureDate)
            .setDepartureCity(departureCity)
            .setArrivalCity(arrivalCity)
            .setCarPlan(carPlan)
            .setTrainPlan(trainPlan);
    }
}
