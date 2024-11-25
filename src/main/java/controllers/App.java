package controllers;

import models.Planet;
import enums.PlanetType;
import views.SystemSolarViews;

public class App {
    public static void main(String[] args) {
        Planet jupiter = new Planet(
                "Jupiter", 79, 1.898e27, 1.43128e15, 139820, 778,
                PlanetType.GASEOUS, true, 11.86, 0.41);

        Planet mars = new Planet(
                "Mars", 2, 6.417e23, 1.6318e11, 6779, 228,
                PlanetType.TERRESTRIAL, true, 1.88, 1.03);

        SystemSolarViews.showMessage("\nPlanet Details:");
        SystemSolarViews.showMessage("Name: " + jupiter.getName());
        SystemSolarViews.showMessage("Number of Satellites: " + jupiter.getNumberOfSatellites());
        SystemSolarViews.showMessage("Mass (kg): " + jupiter.getMass());
        SystemSolarViews.showMessage("Volume (km³): " + jupiter.getVolume());
        SystemSolarViews.showMessage("Diameter (km): " + jupiter.getDiameter());
        SystemSolarViews.showMessage("Average Distance from Sun (million km): " + jupiter.getAverageDistanceFromSun());
        SystemSolarViews.showMessage("Planet Type: " + jupiter.getType());
        SystemSolarViews.showMessage("Orbital period (years): " + jupiter.getOrbitalPeriod());
        SystemSolarViews.showMessage("Rotation period (days): " + jupiter.getRotationPeriod());
        SystemSolarViews.showMessage(String.format("Density: %.2f kg/km³", jupiter.calculateDensity()));
        SystemSolarViews.showMessage("Is it an outer planet? " + (jupiter.isOuterPlanet() ? "Yes" : "No"));

        SystemSolarViews.showMessage("\nPlanet Details:");
        SystemSolarViews.showMessage("Name: " + mars.getName());
        SystemSolarViews.showMessage("Number of Satellites: " + mars.getNumberOfSatellites());
        SystemSolarViews.showMessage("Mass (kg): " + mars.getMass());
        SystemSolarViews.showMessage("Volume (km³): " + mars.getVolume());
        SystemSolarViews.showMessage("Diameter (km): " + mars.getDiameter());
        SystemSolarViews.showMessage("Average Distance from Sun (million km): " + mars.getAverageDistanceFromSun());
        SystemSolarViews.showMessage("Planet Type: " + mars.getType());
        SystemSolarViews.showMessage("Orbital period (years): " + mars.getOrbitalPeriod());
        SystemSolarViews.showMessage("Rotation period (days): " + mars.getRotationPeriod());
        SystemSolarViews.showMessage(String.format("Density: %.2f kg/km³", mars.calculateDensity()));
        SystemSolarViews.showMessage("Is it an outer planet? " + (mars.isOuterPlanet() ? "Yes" : "No"));
    }
}