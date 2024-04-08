public class BikesToBuild {
    private String bikeOrPart; // e.g. bike / cranks
    private String size; // e.g. mini / Xcm long
    private String brand; // e.g. Haro
    private String make; // e.g. mini
    private String colour; // e.g. black
    private String extraInfo; // extra information about bike/part

    public BikesToBuild(String bikeOrPart, String size, String brand, String make, String colour, String extraInfo) {
        this.bikeOrPart = bikeOrPart;
        this.size = size;
        this.brand = brand;
        this.make = make;
        this.colour = colour;
        this.extraInfo = extraInfo;
    }
}
// -Bikes to be built (brand, make) and spare bike parts (part of bike, manufacturer)