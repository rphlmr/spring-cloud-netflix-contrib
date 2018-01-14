package com.rphlmr.routeplanner.httpclient;

import com.rphlmr.routeplanner.model.TrainPlan;
import java.time.LocalDateTime;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
@FeignClient(
    name = "trainplanner",
    fallbackFactory = TrainPlannerHandlerFallbackFactory.class)
public interface TrainPlannerHandler {

    @RequestMapping(value = "/plan", method = RequestMethod.GET)
    TrainPlan findTrainPlanFor(
        @RequestParam("departureRailStation") final String departureRailStation,
        @RequestParam("arrivalRailStation") final String arrivalRailStation,
        @RequestParam(value = "departureDateWishes", required = false) final LocalDateTime departureDateWishes);

}
