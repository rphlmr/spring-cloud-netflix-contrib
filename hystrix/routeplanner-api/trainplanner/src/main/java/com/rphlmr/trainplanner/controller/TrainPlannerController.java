package com.rphlmr.trainplanner.controller;

import com.rphlmr.trainplanner.model.TrainPlan;
import com.rphlmr.trainplanner.service.TrainPlannerService;
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
public class TrainPlannerController {

    private final TrainPlannerService trainPlannerService;

    public TrainPlannerController(TrainPlannerService trainPlannerService) {
        this.trainPlannerService = trainPlannerService;
    }

    @GetMapping
    public ResponseEntity<TrainPlan> findTrainPlanFor(
        @RequestParam(name = "departureDateWishes", required = false) LocalDateTime departureDateWishes,
        @RequestParam("departureRailStation") final String departureRailStation,
        @RequestParam("arrivalRailStation") final String arrivalRailStation) {
        TrainPlan trainPlan = trainPlannerService
            .findTrainPlanFor(departureRailStation, arrivalRailStation, Optional.ofNullable(departureDateWishes)
                .orElse(LocalDateTime.now()));
        return ResponseEntity.ok(trainPlan);
    }
}
