package com.marsaint.arshiva;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenBody {

//    private final String name;
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenBody> satellites;
//    private final BodyTypes bodyType;

    //enum
    public enum BodyTypes {
        STAR, PLANET, DWARF_PLANET, MOON, COMET, ASTEROID
    }

    public HeavenBody(String name, double orbitalPeriod, BodyTypes bodyType) {
//        this.name = name;
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
//        this.bodyType = bodyType;
    }

//    public String getName() {
//        return name;
//    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

//    public BodyTypes getBodyType() {
//        return bodyType;
//    }

    //able to add moon...
    public boolean addSatellite(HeavenBody moon) {
        return this.satellites.add(moon);
    }

    //modify get satellite to return hashset's object's copy
    public Set<HeavenBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            System.out.println("obj is same");
            return true;
        }
        if (obj instanceof HeavenBody) {
            HeavenBody object = (HeavenBody) obj;
            if (this.key.equals(object.key)) {
                return true;
            }
        }
        return false;
//        System.out.println("obj.getClass: " + obj.getClass());
//        System.out.println("this.getClass: " + this.getClass());
//
//        if (obj == null || (obj.getClass() != this.getClass()) ) {
//            System.out.println("different class");
//            return false;
//        }
//
//        String objName = ((HeavenBody)obj).getName();
//        if (this.name.equals(objName)) {
//            System.out.println("name is same");
//            return true;
//        } else {
//            System.out.println("name is different");
//            return false;
//        }
//        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
//        System.out.println("fuck tim buchalka hashcode + 57 ");
//        System.out.println("==hashcode name: " + this.name.hashCode() +
//                "== ==hashcode body: " + this.bodyType.hashCode());
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyTypes) {
        return new Key(name, bodyTypes);
    }

    @Override
    public String toString() {
        String newToString = this.key.name + ": " + this.key.bodyTypes + ", " + this.orbitalPeriod;
        return newToString;
    }

    //Key inner class
    public static final class Key {

        private String name;
        private BodyTypes bodyTypes;

        private Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyTypes = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyTypes() {
            return bodyTypes;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + this.bodyTypes.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (this.name.equals(key.getName())) {
                return (this.bodyTypes == key.getBodyTypes());
            } else {
                return false;
            }
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyTypes;
        }
    }
}
