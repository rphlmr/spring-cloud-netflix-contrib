package com.rphlmr.routeplanner.model;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
public class RoutePlan {

    private String planId;
    private String departureDateWishes;
    private String departureCity;
    private String arrivalCity;
    private CarPlan carPlan;
    private TrainPlan trainPlan;

    public String getPlanId() {
        return planId;
    }

    public RoutePlan setPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    public String getDepartureDateWishes() {
        return departureDateWishes;
    }

    public RoutePlan setDepartureDateWishes(String departureDateWishes) {
        this.departureDateWishes = departureDateWishes;
        return this;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public RoutePlan setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
        return this;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public RoutePlan setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
        return this;
    }

    public CarPlan getCarPlan() {
        return carPlan;
    }

    public RoutePlan setCarPlan(CarPlan carPlan) {
        this.carPlan = carPlan;
        return this;
    }

    public TrainPlan getTrainPlan() {
        return trainPlan;
    }

    public RoutePlan setTrainPlan(TrainPlan trainPlan) {
        this.trainPlan = trainPlan;
        return this;
    }
}
