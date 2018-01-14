package com.rphlmr.routeplanner.httpclient;

import com.rphlmr.routeplanner.model.CarPlan;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
@Component
public class CarPlannerHandlerFallbackFactory implements FallbackFactory<CarPlannerHandler> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CarPlannerHandlerFallbackFactory.class);

    @Override
    public CarPlannerHandler create(Throwable throwable) {
        String message = throwable != null ?
            throwable.getMessage() : "unknow error";

        return (departureCity, arrivalCity, departureDate) -> {
            LOGGER.error("Fallback; findCarPlanFor, reason was : {}", message);
            return new CarPlan();
        };
    }
}
