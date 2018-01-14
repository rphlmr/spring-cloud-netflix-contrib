package com.rphlmr.carplanner.model;

import java.time.LocalDateTime;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
public class CarPlan {

    private String planId;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;
    private String travelTime;
    private String departureCity;
    private String arrivalCity;

    public String getPlanId() {
        return planId;
    }

    public CarPlan setPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    public String getDepartureDate() {
        return departureDate.toString();
    }

    public CarPlan setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
        return this;
    }

    public String getArrivalDate() {
        return arrivalDate.toString();
    }

    public CarPlan setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
        return this;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public CarPlan setTravelTime(String travelTime) {
        this.travelTime = travelTime;
        return this;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public CarPlan setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
        return this;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public CarPlan setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
        return this;
    }
}
