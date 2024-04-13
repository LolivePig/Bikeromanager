package com.georgethepig.bikeromanager.misc;

import java.util.Objects;

public class BikesToBuild { // -Bikes to be built (brand, make) and spare bike parts (part of bike, manufacturer)

    public BikesToBuild(String bikeOrPart, String size, String brand, String make, String colour, String extraInfo) {
        this.bikeOrPart = bikeOrPart;
        this.size = size;
        this.brand = brand;
        this.make = make;
        this.colour = colour;
        this.extraInfo = extraInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BikesToBuild that = (BikesToBuild) o;
        return Objects.equals(bikeOrPart, that.bikeOrPart) && Objects.equals(size, that.size) && Objects.equals(brand, that.brand) && Objects.equals(make, that.make) && Objects.equals(colour, that.colour) && Objects.equals(extraInfo, that.extraInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bikeOrPart, size, brand, make, colour, extraInfo);
    }

    @Override
    public String toString() {
        return "BikesToBuild{" +
                "bikeOrPart='" + bikeOrPart + '\'' +
                ", size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                ", make='" + make + '\'' +
                ", colour='" + colour + '\'' +
                ", extraInfo='" + extraInfo + '\'' +
                '}';
    }

    private String bikeOrPart; // e.g. bike / cranks
    private String size; // e.g. mini / Xcm long
    private String brand; // e.g. Haro
    private String make; // e.g. mini
    private String colour; // e.g. black
    private String extraInfo; // extra information about bike/part

    public String getBikeOrPart() {return bikeOrPart;}
    public void setBikeOrPart(String bikeOrPart) {this.bikeOrPart = bikeOrPart;}

    public String getSize() {return size;}
    public void setSize(String size) {this.size = size;}

    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    public String getMake() {return make;}
    public void setMake(String make) {this.make = make;}

    public String getColour() {return colour;}
    public void setColour(String colour) {this.colour = colour;}

    public String getExtraInfo() {return extraInfo;}
    public void setExtraInfo(String extraInfo) {this.extraInfo = extraInfo;}
}