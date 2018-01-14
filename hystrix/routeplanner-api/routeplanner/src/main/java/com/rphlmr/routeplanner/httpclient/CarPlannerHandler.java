package com.rphlmr.routeplanner.httpclient;

import com.rphlmr.routeplanner.model.CarPlan;
import java.time.LocalDateTime;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
@FeignClient(
    name = "carplanner",
    fallbackFactory = CarPlannerHandlerFallbackFactory.class)
public interface CarPlannerHandler {

    @RequestMapping(value = "/plan", method = RequestMethod.GET)
    CarPlan findCarPlanFor(
        @RequestParam("departureCity") final String departureCity,
        @RequestParam("arrivalCity") final String arrivalCity,
        @RequestParam("departureDate") final LocalDateTime departureDate);
}
