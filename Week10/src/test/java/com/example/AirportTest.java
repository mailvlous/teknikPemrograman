package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class AirportTest {

    @DisplayName("Given there is an economy flight")
    @Nested
    class EconomyFlightTest {

        private Flight economyFlight;

        @BeforeEach
        void setUp() {
            economyFlight = new Flight("1", "Economy");
        }

        @Test
        public void testEconomyFlightRegularPassenger() {
            Passenger mike = new Passenger("Mike", false);

            assertEquals("1", economyFlight.getId());
            assertTrue(economyFlight.addPassenger(mike));
            assertEquals(1, economyFlight.getPassengersList().size());
            assertEquals("Mike", economyFlight.getPassengersList().get(0).getName());

            assertTrue(economyFlight.removePassenger(mike));
            assertEquals(0, economyFlight.getPassengersList().size());
        }

        @Test
        public void testEconomyFlightVipPassenger() {
            Passenger james = new Passenger("James", true);

            assertEquals("1", economyFlight.getId());
            assertTrue(economyFlight.addPassenger(james));
            assertEquals(1, economyFlight.getPassengersList().size());
            assertEquals("James", economyFlight.getPassengersList().get(0).getName());

            assertFalse(economyFlight.removePassenger(james));
            assertEquals(1, economyFlight.getPassengersList().size());
        }

        @DisplayName("Given there is a business flight")
        
        @Nested
        class BusinessFlightTest {

            private Flight businessFlight;

            @BeforeEach
            void setUp() {
                businessFlight = new Flight("2", "Business");
            }

            @Test
            public void testBusinessFlightRegularPassenger() {
                Passenger mike = new Passenger("Mike", false);

                assertEquals("2", businessFlight.getId());
                assertEquals(false, businessFlight.addPassenger(mike));
                assertEquals(0, businessFlight.getPassengersList().size());

                assertEquals(false, businessFlight.removePassenger(mike));
                assertEquals(0, businessFlight.getPassengersList().size());
            }

            @Test
            public void testBusinessFlightVipPassenger() {
                Passenger james = new Passenger("James", true);

                assertEquals("2", businessFlight.getId());
                assertEquals(true, businessFlight.addPassenger(james));
                assertEquals(1, businessFlight.getPassengersList().size());

                assertEquals(false, businessFlight.removePassenger(james));
                assertEquals(1, businessFlight.getPassengersList().size());
            }
        }

    }
}
