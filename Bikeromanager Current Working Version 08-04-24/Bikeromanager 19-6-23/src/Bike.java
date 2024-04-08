public class Bike {
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
        this.operational = operational;
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
}
// "operational" is master set of tyrePressure to hasFork