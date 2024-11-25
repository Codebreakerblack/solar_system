package models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import enums.PlanetType;

public class PlanetTest {

    @Test
    public void testPlanetInitialization() {
        Planet earth = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 149,
                PlanetType.TERRESTRIAL, true, 1.0, 1.0);

        assertEquals("Earth", earth.getName());
        assertEquals(1, earth.getNumberOfSatellites());
        assertEquals(5.972e24, earth.getMass());
        assertEquals(1.08321e12, earth.getVolume());
        assertEquals(12742, earth.getDiameter());
        assertEquals(149, earth.getAverageDistanceFromSun());
        assertEquals(PlanetType.TERRESTRIAL, earth.getType());
        assertTrue(earth.isObservableWithNakedEye());
        assertEquals(1.0, earth.getOrbitalPeriod());
        assertEquals(1.0, earth.getRotationPeriod());
    }

    @Test
    void testCalculateDensity() {
        Planet earth = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 149,
                                   PlanetType.TERRESTRIAL, true, 1.0, 1.0);

        double expectedDensity = 5.972e24 / 1.08321e12;
        assertEquals(expectedDensity, earth.calculateDensity(), 1e-5);
    }

    
    @Test
    void testIsOuterPlanet() {
        Planet jupiter = new Planet("Jupiter", 79, 1.898e27, 1.43128e15, 139820, 778,
                                    PlanetType.GASEOUS, true, 11.86, 0.41);
        Planet mars = new Planet("Mars", 2, 6.417e23, 1.6318e11, 6779, 228,
                                 PlanetType.TERRESTRIAL, true, 1.88, 1.03);

        assertTrue(jupiter.isOuterPlanet());
        assertFalse(mars.isOuterPlanet());
    }
}
