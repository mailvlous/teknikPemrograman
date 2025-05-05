package com.example;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AirportTest {

    private static final Logger logger = Logger.getLogger(AirportTest.class.getName());

    private Flight economyFlight;
    private Flight businessFlight;
    private Passenger mike;
    private Passenger james;

    @Test
    public void testRunExampleDoesNotThrow() {
        assertDoesNotThrow(() -> Airport.runExample());
    }

    @BeforeEach
    void setUp() {
        economyFlight = new Flight("1", "Economy");
        businessFlight = new Flight("2", "Business");
        mike = new Passenger("Mike", false);   // regular
        james = new Passenger("James", true);  // VIP
    }

    @Test
    public void testEconomyFlightWithRegularPassenger() {
        logger.info("Test: Regular passenger on Economy flight");

        assertTrue(economyFlight.addPassenger(mike));
        assertEquals(1, economyFlight.getPassengersList().size());
        assertEquals("Mike", economyFlight.getPassengersList().get(0).getName());

        assertTrue(economyFlight.removePassenger(mike));
        assertEquals(0, economyFlight.getPassengersList().size());
    }

    @Test
    public void testEconomyFlightWithVipPassenger() {
        logger.info("Test: VIP passenger on Economy flight");

        assertTrue(economyFlight.addPassenger(james));
        assertEquals(1, economyFlight.getPassengersList().size());
        assertEquals("James", economyFlight.getPassengersList().get(0).getName());

        assertFalse(economyFlight.removePassenger(james));
        assertEquals(1, economyFlight.getPassengersList().size());
    }

    @Test
    public void testBusinessFlightWithRegularPassenger() {
        logger.info("Test: Regular passenger on Business flight");

        assertFalse(businessFlight.addPassenger(mike));
        assertEquals(0, businessFlight.getPassengersList().size());

        assertFalse(businessFlight.removePassenger(mike));
        assertEquals(0, businessFlight.getPassengersList().size());
    }

    @Test
    public void testBusinessFlightWithVipPassenger() {
        logger.info("Test: VIP passenger on Business flight");

        assertTrue(businessFlight.addPassenger(james));
        assertEquals(1, businessFlight.getPassengersList().size());
        assertEquals("James", businessFlight.getPassengersList().get(0).getName());

        assertFalse(businessFlight.removePassenger(james));
        assertEquals(1, businessFlight.getPassengersList().size());
    }
}
