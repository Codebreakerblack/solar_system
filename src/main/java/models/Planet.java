package models;

import enums.PlanetType;

public class Planet {
    private String name;
    private int numberOfSatellites;
    private double mass;
    private double volume;
    private int diameter;
    private int averageDistanceFromSun;
    private PlanetType type;
    private boolean observableWithNakedEye;

    public Planet(String name, int numberOfSatellites, double mass, double volume, int diameter,
            int averageDistanceFromSun, PlanetType type, boolean observableWithNakedEye) {
        this.name = name;
        this.numberOfSatellites = numberOfSatellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.averageDistanceFromSun = averageDistanceFromSun;
        this.type = type;
        this.observableWithNakedEye = observableWithNakedEye;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public double getMass() {
        return mass;
    }

    public double getVolume() {
        return volume;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getAverageDistanceFromSun() {
        return averageDistanceFromSun;
    }

    public PlanetType getType() {
        return type;
    }

    public boolean isObservableWithNakedEye() {
        return observableWithNakedEye;
    }

    public double calculateDensity() {
        return mass / volume;
    }

    public boolean isOuterPlanet() {
        double distanceAU = averageDistanceFromSun * 1e6 / 149597870.0;
        return distanceAU > 3.4;
    }
}