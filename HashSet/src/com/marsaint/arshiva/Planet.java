package com.marsaint.arshiva;

public class Planet extends HeavenBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenBody moon) {
        if (moon.getKey().getBodyTypes() == BodyTypes.MOON) {
            System.out.println("body type is moon, add moon to planet");
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
