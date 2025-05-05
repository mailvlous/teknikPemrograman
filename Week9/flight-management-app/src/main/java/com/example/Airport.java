package com.example;
import java.util.logging.Logger;

public class Airport {
    private static final Logger logger = Logger.getLogger(Airport.class.getName());

    public static void main(String[] args) {
        runExample();
    }

    public static void runExample() {
        Flight economyFlight = new Flight("1", "Economy");
        Flight businessFlight = new Flight("2", "Business");

        Passenger james = new Passenger("James", true);
        Passenger mike = new Passenger("Mike", false);

        businessFlight.addPassenger(james);
        businessFlight.removePassenger(james);
        businessFlight.addPassenger(mike);
        economyFlight.addPassenger(mike);

        logger.info("Economy flight passengers list:");
        for (Passenger passenger : economyFlight.getPassengersList()) {
            logger.info(passenger.getName());
        }
    }
}
