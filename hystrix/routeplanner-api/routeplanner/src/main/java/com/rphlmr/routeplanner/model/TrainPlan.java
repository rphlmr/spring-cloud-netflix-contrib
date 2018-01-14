package com.rphlmr.routeplanner.model;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
public class TrainPlan {

    private String planId;
    private String departureDateWishes;
    private String departureDate;
    private String arrivalDate;
    private String travelTime;
    private String departureRailStation;
    private String arrivalRailStation;

    public String getPlanId() {
        return planId;
    }

    public TrainPlan setPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    public String getDepartureDateWishes() {
        return departureDateWishes;
    }

    public TrainPlan setDepartureDateWishes(String departureDateWishes) {
        this.departureDateWishes = departureDateWishes;
        return this;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public TrainPlan setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
        return this;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public TrainPlan setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
        return this;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public TrainPlan setTravelTime(String travelTime) {
        this.travelTime = travelTime;
        return this;
    }

    public String getDepartureRailStation() {
        return departureRailStation;
    }

    public TrainPlan setDepartureRailStation(String departureRailStation) {
        this.departureRailStation = departureRailStation;
        return this;
    }

    public String getArrivalRailStation() {
        return arrivalRailStation;
    }

    public TrainPlan setArrivalRailStation(String arrivalRailStation) {
        this.arrivalRailStation = arrivalRailStation;
        return this;
    }
}
