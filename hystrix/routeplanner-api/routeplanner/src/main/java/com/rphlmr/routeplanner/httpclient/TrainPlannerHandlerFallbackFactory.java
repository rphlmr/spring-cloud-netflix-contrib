package com.rphlmr.routeplanner.httpclient;

import com.rphlmr.routeplanner.model.TrainPlan;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
@Component
public class TrainPlannerHandlerFallbackFactory implements FallbackFactory<TrainPlannerHandler> {

    private static final Logger LOGGER = LoggerFactory.getLogger(TrainPlannerHandlerFallbackFactory.class);

    @Override
    public TrainPlannerHandler create(Throwable throwable) {
        String message = throwable != null ?
            throwable.getMessage() : "unknow error";

        return (departureRailStation, arrivalRailStation, departureDateWishes) -> {
            LOGGER.error("Fallback; findTrainPlanFor, reason was : {}", message);
            return new TrainPlan();
        };
    }
}
