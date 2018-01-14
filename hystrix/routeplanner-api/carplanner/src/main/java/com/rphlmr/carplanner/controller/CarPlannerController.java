package com.rphlmr.carplanner.controller;

import com.rphlmr.carplanner.model.CarPlan;
import com.rphlmr.carplanner.service.CarPlannerService;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
@RestController
@RequestMapping(value = "/plan",
    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CarPlannerController {

    private final CarPlannerService carPlannerService;

    public CarPlannerController(CarPlannerService carPlannerService) {
        this.carPlannerService = carPlannerService;
    }

    @GetMapping
    public ResponseEntity<CarPlan> findCarPlanFor(
        @RequestParam(name = "departureDate", required = false) LocalDateTime departureDate,
        @RequestParam("departureCity") final String departureCity,
        @RequestParam("arrivalCity") final String arrivalCity) {
        CarPlan carPlan = carPlannerService.findCarPlanFor(departureCity, arrivalCity,
            Optional.ofNullable(departureDate).orElse(LocalDateTime.now()));
        return ResponseEntity.ok(carPlan);
    }
}
