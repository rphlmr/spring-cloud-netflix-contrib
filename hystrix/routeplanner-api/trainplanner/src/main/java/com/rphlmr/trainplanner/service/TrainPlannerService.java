package com.rphlmr.trainplanner.service;

import com.rphlmr.trainplanner.model.TrainPlan;
import com.rphlmr.trainplanner.repository.TrainPlannerRepository;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
@Service
public class TrainPlannerService {

    private final TrainPlannerRepository trainPlannerRepository;

    public TrainPlannerService(TrainPlannerRepository trainPlannerRepository) {
        this.trainPlannerRepository = trainPlannerRepository;
    }

    public TrainPlan findTrainPlanFor(final String departureRailStation, final String arrivalRailStation,
        final LocalDateTime departureDateWishes) {

        return trainPlannerRepository.findTrainPlanFor(departureRailStation, arrivalRailStation, departureDateWishes);
    }

}
