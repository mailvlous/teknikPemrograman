package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Flight {

    private String id;
    private List<Passenger> passengers = new ArrayList<>();
    private String flightType;

    public Flight(String id, String flightType) {
        this.id = id;
        this.flightType = flightType;
    }

    public String getId() {
        return id;
    }

    public List<Passenger> getPassengersList() {
        return Collections.unmodifiableList(passengers);
    }

    public String getFlightType() {
        return flightType;
    }

    public boolean addPassenger(Passenger passenger) {
        switch (flightType) {
            case "Economy":
                return passengers.add(passenger);
            case "Business":
                if (passenger.isVip()) {
                    return passengers.add(passenger);
                }
                return false;
            default:
                throw new Flight.UnknownFlightTypeException(flightType);
        }
    }

    public boolean removePassenger(Passenger passenger) {
        switch (flightType) {
            case "Economy":
                if (!passenger.isVip()) {
                    return passengers.remove(passenger);
                }
                return false;
            case "Business":
                return false;
            default:
                throw new Flight.UnknownFlightTypeException(flightType);
        }
    }

    // ✅ Inner class: exception khusus
    private static class UnknownFlightTypeException extends RuntimeException {
        public UnknownFlightTypeException(String flightType) {
            super("Unknown flight type: " + flightType);
        }
    }
}
