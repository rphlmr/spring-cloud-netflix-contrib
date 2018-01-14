package com.rphlmr.routeplanner.controller;

import com.rphlmr.routeplanner.model.RoutePlan;
import com.rphlmr.routeplanner.service.RoutePlannerService;
import java.time.LocalDateTime;
import org.apache.commons.lang.StringUtils;
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
public class RoutePlannerController {

    private final RoutePlannerService routePlannerService;

    public RoutePlannerController(RoutePlannerService routePlannerService) {
        this.routePlannerService = routePlannerService;
    }


    @GetMapping
    public ResponseEntity<RoutePlan> findRoutePlanFor(
        @RequestParam(name = "departureDate", required = false, defaultValue = "") String departureDate,
        @RequestParam("departureCity") final String departureCity,
        @RequestParam("arrivalCity") final String arrivalCity) {
        RoutePlan carPlan = routePlannerService.findRoutePlanFor(departureCity, arrivalCity,
            StringUtils.defaultIfBlank(departureDate, LocalDateTime.now().toString()));
        return ResponseEntity.ok(carPlan);
    }
}
