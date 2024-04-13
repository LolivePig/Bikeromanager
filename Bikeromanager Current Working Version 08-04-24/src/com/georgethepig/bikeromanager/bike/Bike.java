package com.georgethepig.bikeromanager.bike;

import java.util.Objects;

public class Bike {

    public Bike (int numberPlate, int size, String brand, String make, String colour, boolean washed, boolean operational,
                 boolean tyrePressure, boolean tightChain, int brakes, boolean hasWheels, boolean hasCranks,
                 boolean hasPedals, boolean hasHandlebars, boolean hasHandlebarsGrips, boolean hasFork,
                 String extraInfo) {
        this.numberPlate = numberPlate;
        this.size = size;
        this.brand = brand;
        this.make = make;
        this.colour = colour;
        this.washed = washed;
        this.operational = operational; // "operational" is master set of tyrePressure to hasFork, delete them?
        this.tyrePressure = tyrePressure;
        this.tightChain = tightChain;
        this.brakes = brakes;
        this.hasWheels = hasWheels;
        this.hasCranks = hasCranks;
        this.hasPedals = hasPedals;
        this.hasHandlebars = hasHandlebars;
        this.hasHandlebarGrips = hasHandlebarsGrips;
        this.hasFork = hasFork;
        this.extraInfo = extraInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return numberPlate == bike.numberPlate && size == bike.size && washed == bike.washed && operational == bike.operational && tyrePressure == bike.tyrePressure && tightChain == bike.tightChain && brakes == bike.brakes && hasWheels == bike.hasWheels && hasCranks == bike.hasCranks && hasPedals == bike.hasPedals && hasHandlebars == bike.hasHandlebars && hasHandlebarGrips == bike.hasHandlebarGrips && hasFork == bike.hasFork && Objects.equals(brand, bike.brand) && Objects.equals(make, bike.make) && Objects.equals(colour, bike.colour) && Objects.equals(extraInfo, bike.extraInfo);
    }

    // "equals()" allows you to check the equality of two objects e.g. bike1 and bike2; after setting properties for
    // them, you can check if they are the same then do bike1.equals(bike2); they likely won't be equal, used for large
    // amounts of data in lists and arrays

    @Override
    public int hashCode() {
        return Objects.hash(numberPlate, size, brand, make, colour, washed, operational, tyrePressure, tightChain, brakes, hasWheels, hasCranks, hasPedals, hasHandlebars, hasHandlebarGrips, hasFork, extraInfo);
    }

    // "hashCode()" generates unique hash to identify the object; can serialise objects into json and xml or unserialise
    // into objects; old program called "serialisable" coming from this

    @Override
    public String toString() {
        return "Bike{" +
                "numberPlate=" + numberPlate +
                ", size=" + size +
                ", brand='" + brand + '\'' +
                ", make='" + make + '\'' +
                ", colour='" + colour + '\'' +
                ", washed=" + washed +
                ", operational=" + operational +
                ", tyrePressure=" + tyrePressure +
                ", tightChain=" + tightChain +
                ", brakes=" + brakes +
                ", hasWheels=" + hasWheels +
                ", hasCranks=" + hasCranks +
                ", hasPedals=" + hasPedals +
                ", hasHandlebars=" + hasHandlebars +
                ", hasHandlebarGrips=" + hasHandlebarGrips +
                ", hasFork=" + hasFork +
                ", extraInfo='" + extraInfo + '\'' +
                '}';
    }

    // "toString()" allows you to output information about the object

    private int numberPlate; // 1 - 999
    private int size; // micro mini to pro XXL - 1 to approx 10
    private String brand; // e.g. Haro
    private String make; // e.g. Mini
    private String colour; // e.g. Black
    private boolean washed; // washed - true, dirty - false
    private boolean operational; // operational - true, anything missing/broken - false
        private boolean tyrePressure; // acceptable - true, too far below - false
        private boolean tightChain; // acceptable tightness - true, too loose - false
        private int brakes; // broken - 1, mediocre - 2, good - 3
        private boolean hasWheels; // yes - true, missing/broken - false
        private boolean hasCranks; // yes - true, missing/broken - false
        private boolean hasPedals; // yes - true, missing/broken - false
        private boolean hasHandlebars; // yes - true, missing/broken - false
        private boolean hasHandlebarGrips; // yes - true, missing/broken - false
        private boolean hasFork; // yes - true, missing/broken - false
    private String extraInfo; // extra information about bike

    public String getExtraInfo() {return extraInfo;}
    public void setExtraInfo(String extraInfo) {this.extraInfo = extraInfo;}

    public boolean isHasFork() {return hasFork;}
    public void setHasFork(boolean hasFork) {this.hasFork = hasFork;}

    public boolean isHasHandlebarGrips() {return hasHandlebarGrips;}
    public void setHasHandlebarGrips(boolean hasHandlebarGrips) {this.hasHandlebarGrips = hasHandlebarGrips;}

    public boolean isHasHandlebars() {return hasHandlebars;}
    public void setHasHandlebars(boolean hasHandlebars) {this.hasHandlebars = hasHandlebars;}

    public boolean isHasPedals() {return hasPedals;}
    public void setHasPedals(boolean hasPedals) {this.hasPedals = hasPedals;}

    public boolean isHasCranks() {return hasCranks;}
    public void setHasCranks(boolean hasCranks) {this.hasCranks = hasCranks;}

    public boolean isHasWheels() {return hasWheels;}
    public void setHasWheels(boolean hasWheels) {this.hasWheels = hasWheels;}

    public int getBrakes() {return brakes;}
    public void setBrakes(int brakes) {this.brakes = brakes;}

    public boolean isTightChain() {return tightChain;}
    public void setTightChain(boolean tightChain) {this.tightChain = tightChain;}

    public boolean isTyrePressure() {return tyrePressure;}
    public void setTyrePressure(boolean tyrePressure) {this.tyrePressure = tyrePressure;}

    public boolean isOperational() {return operational;}
    public void setOperational(boolean operational) {this.operational = operational;}

    public boolean isWashed() {return washed;}
    public void setWashed(boolean washed) {this.washed = washed;}

    public String getColour() {return colour;}
    public void setColour(String colour) {this.colour = colour;}

    public String getMake() {return make;}
    public void setMake(String make) {this.make = make;}

    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}

    public int getNumberPlate() {return numberPlate;}
    public void setNumberPlate(int numberPlate) {this.numberPlate = numberPlate;}
}