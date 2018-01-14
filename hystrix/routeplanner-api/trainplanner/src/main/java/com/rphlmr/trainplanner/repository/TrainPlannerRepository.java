package com.rphlmr.trainplanner.repository;

import com.rphlmr.trainplanner.model.TrainPlan;
import java.time.LocalDateTime;
import java.util.Random;
import org.springframework.stereotype.Repository;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
@Repository
public class TrainPlannerRepository {

    public TrainPlan findTrainPlanFor(final String departureRailStation, final String arrivalRailStation,
        final LocalDateTime departureDateWishes) {

        randomSlowdown();

        return new TrainPlan()
            .setPlanId("T:45678")
            .setDepartureDateWishes(departureDateWishes)
            .setDepartureDate(departureDateWishes.plusMinutes(20L))
            .setTravelTime("120")
            .setArrivalDate(departureDateWishes.plusMinutes(80L))
            .setDepartureRailStation(departureRailStation)
            .setArrivalRailStation(arrivalRailStation);
    }

    private void randomSlowdown() {
        Random random = new Random();
        boolean timeout = random.nextInt(3) + 1 == 3;

        if (timeout) {
            slowdown();
        }
    }

    private void slowdown() {

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
