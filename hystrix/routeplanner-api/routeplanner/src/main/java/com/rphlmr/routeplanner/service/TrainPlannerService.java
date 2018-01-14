package com.rphlmr.routeplanner.service;

import com.rphlmr.routeplanner.httpclient.TrainPlannerHandler;
import com.rphlmr.routeplanner.model.TrainPlan;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
@Service
public class TrainPlannerService {

    private final TrainPlannerHandler trainPlannerHanlder;

    public TrainPlannerService(TrainPlannerHandler trainPlannerHanlder) {
        this.trainPlannerHanlder = trainPlannerHanlder;
    }

    public TrainPlan findTrainPlanFor(final String departureRailStation, final String arrivalRailStation,
        final String departureDateWishes) {
        return trainPlannerHanlder.findTrainPlanFor(departureRailStation, arrivalRailStation,
            LocalDateTime.parse(departureDateWishes));
    }
}
