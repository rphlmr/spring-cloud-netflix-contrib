package com.rphlmr.carplanner.repository;

import com.rphlmr.carplanner.model.CarPlan;
import java.time.LocalDateTime;
import java.util.Random;
import org.springframework.stereotype.Repository;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
@Repository
public class CarPlannerRepository {

    public CarPlan findCarPlanFor(final String departureCity, final String arrivalCity,
        final LocalDateTime departureDate) {

        randomSlowdown();

        return new CarPlan()
            .setPlanId("C:34988")
            .setDepartureDate(departureDate)
            .setTravelTime("120")
            .setArrivalDate(departureDate.plusMinutes(180L))
            .setDepartureCity(departureCity)
            .setArrivalCity(arrivalCity);
    }

    private void randomSlowdown() {
        Random random = new Random();
        boolean timeout = random.nextInt(5) + 1 == 5;

        if (timeout) {
            slowdown();
        }
    }

    private void slowdown() {
        Random random = new Random();
        int timeoutMultiplier = random.nextInt(5);

        try {
            Thread.sleep(300 * timeoutMultiplier);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
