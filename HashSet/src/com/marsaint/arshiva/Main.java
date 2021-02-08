package com.marsaint.arshiva;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<HeavenBody.Key, HeavenBody> solarSystem = new HashMap<>();
    private static Set<HeavenBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenBody temp = new Planet("Earth", 365);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        temp = new Planet("Venus", 666);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        temp = new Planet("Mars", 366);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        temp = new Planet("Jupiter", 999);
        planets.add(temp);
        solarSystem.put(temp.getKey(), temp);

        HeavenBody tempMoon = new Moon("Moon", 30);
        planets.add(tempMoon);
        solarSystem.put(tempMoon.getKey(), tempMoon);

        tempMoon = new Moon("Mars Moon", 36);
        planets.add(tempMoon);
        solarSystem.put(tempMoon.getKey(), tempMoon);

        HeavenBody tempDP = new DwarfPlanet("Pluto", 99);
        planets.add(tempDP);
        solarSystem.put(tempDP.getKey(), tempDP);

        tempDP = new DwarfPlanet("Maputo", 199);
        planets.add(tempDP);
        solarSystem.put(tempDP.getKey(), tempDP);

        for (HeavenBody planet : planets) {
            System.out.println(planet.toString());
        }

//        HeavenBody earth = new HeavenBody("Earth", 365);
//        HeavenBody moon = new HeavenBody("Moon", 30);
//        earth.addMoon(moon);
//
//        System.out.println(earth.getSatellites());

//        HeavenBody temp = new HeavenBody("Mercury", 88);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenBody("Venus", 225);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        temp = new HeavenBody("Earth", 365);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        HeavenBody tempMoon = new HeavenBody("Moon 1", 27);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        tempMoon = new HeavenBody("Moon 2", 39);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        temp = new HeavenBody("Mars", 687);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//
//        tempMoon = new HeavenBody("Mars Moon 1", 39);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        tempMoon = new HeavenBody("Mars Moon 2", 48);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        tempMoon = new HeavenBody("Mars Moon 3", 13);
//        solarSystem.put(tempMoon.getName(), tempMoon);
//        temp.addMoon(tempMoon);
//
//        temp = new HeavenBody("Pluto", 842);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);

//        System.out.println("print planets: ");
//        for (HeavenBody planet : planets) {
//            System.out.println(planet.getName());
////            System.out.println(planet);
//        }

//        System.out.println("print solar system: ");
//        for (String planet : solarSystem.keySet()) {
//            System.out.println(planet + " = " + solarSystem.get(planet));
//        }

//        System.out.println("================================");
//
//        System.out.println("print Earth moon: ");
//        HeavenBody earth = solarSystem.get("Earth");
//        System.out.println(earth.getName() + "'s moons are: ");
//        for (HeavenBody moon : earth.getSatellites()) {
//            System.out.println("\t" + moon.getName());
//        }

//        System.out.println("print Mars moon: ");
//        HeavenBody mars = solarSystem.get("Mars");
//        System.out.println(mars.getName() + "'s moons are: ");
//        for (HeavenBody moon : mars.getSatellites()) {
//            System.out.println("\t" + moon.getName());
//        }

//        System.out.println("================================");
//
//        Set<HeavenBody> allMoons = new HashSet<>();
//        for (HeavenBody planet : planets) {
//            allMoons.addAll(planet.getSatellites());
//        }
//
//        System.out.println("All moon: ");
//        for (HeavenBody moon : allMoons) {
//            System.out.println("\t" + moon.getName());
//        }
//
//        System.out.println("========== multiple pluto =============");
//
//        printPlanets(planets);

        //equal and hashCode
//        HeavenBody pluto = new HeavenBody("Pluto", 842);
//        planets.add(pluto);
//
//        HeavenBody x = new HeavenBody("Pluto", 842);
//        planets.add(x);
//
//        HeavenBody y = new HeavenBody("Pluto", 842);
//        planets.add(y);

//        printPlanets(planets);


//        System.out.println("=========== pluto's name hashcode ==========");
//        System.out.println(pluto.getName().hashCode());
//        System.out.println(x.getName().hashCode());
//        System.out.println(y.getName().hashCode());
//
//        System.out.println("=========== pluto's hashcode ==========");
//        System.out.println(pluto.hashCode());
//        System.out.println(x.hashCode());
//        System.out.println(y.hashCode());

//        System.out.println("================================");
//
//        String stringObject1 = "any String Object 1";
//        String stringObject2 = "any String Object 2";
//        String stringObject3 = "any String Object 3";
//        String stringObject4 = "any String Object 4";
//
//        System.out.println(stringObject1.hashCode());
//        System.out.println(stringObject2.hashCode());
//        System.out.println(stringObject3.hashCode());
//        System.out.println(stringObject4.hashCode());
//
//        System.out.println("================================");
//
//        String duplicateObject = stringObject1;
//        System.out.println(duplicateObject.hashCode());
//
//        System.out.println("============= obj equals obj =============");
//
//        Object o = new Object();
//        o.equals(o);
//        "pluto".equals("");
//
//        if ("pluto".equals("")) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//
//        System.out.println("================================");

//        HeavenBody xBody = new HeavenBody("xBody", 666);
//        HeavenBody yBody = new HeavenBody("yBody", 888);
//        HeavenBody xxBody = new HeavenBody("xBody", 999);

//        System.out.println(xBody.hashCode());
//        System.out.println(xxBody.hashCode());
//        System.out.println(yBody.hashCode());
////        System.out.println(xBody.getName().hashCode());
////        System.out.println(xxBody.getName().hashCode());
//
//        System.out.println(xBody.equals(yBody));



    }


//    public static void printPlanets(Set<HeavenBody> planets) {
//        System.out.println("====== print planets: ... ======");
//        for (HeavenBody planet : planets) {
//            System.out.println(planet.getName() + ", " + planet.getOrbitalPeriod());
//        }
//    }
}
