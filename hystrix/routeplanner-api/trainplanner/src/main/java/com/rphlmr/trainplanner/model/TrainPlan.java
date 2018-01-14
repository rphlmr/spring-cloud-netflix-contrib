package com.rphlmr.trainplanner.model;

import java.time.LocalDateTime;

/**
 * Created by Raphaël Moreau on 13/01/2018
 */
public class TrainPlan {

    private String planId;
    private LocalDateTime departureDateWishes;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;
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
        return departureDateWishes.toString();
    }

    public TrainPlan setDepartureDateWishes(LocalDateTime departureDateWishes) {
        this.departureDateWishes = departureDateWishes;
        return this;
    }

    public String getDepartureDate() {
        return departureDate.toString();
    }

    public TrainPlan setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
        return this;
    }

    public String getArrivalDate() {
        return arrivalDate.toString();
    }

    public TrainPlan setArrivalDate(LocalDateTime arrivalDate) {
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
