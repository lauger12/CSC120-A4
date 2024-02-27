import java.util.ArrayList;

public class Train {

    ArrayList<Car> trainCars;
    Engine myEngine = new Engine(FuelType.STEAM, 100.0, 100.0);
    private int passengerCapacity;
    private int nCars;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
    }

    // accessors

    /**
     * Getter for engine
     * 
     * @return the train's engine
     */
    public Engine getEngine() {
        return this.myEngine;
    }

    /**
     * Getter for "ith" car
     * 
     * @return the passenger's name
     */
    public Car getCar(int i) {
        return this.trainCars.get(i);
    }

    /**
     * Getter for max capacity
     * 
     * @return the passenger capacity of the train
     */
    public int getMaxCapacity() {
        return this.passengerCapacity;
    }

    // public int seatsRemaining(){ // this does not work, not fully implemented
    // // do we call a method from cars, going through each car and returning seats
    // remaining and summing them?
    // return 1;
    // }

    public ArrayList<Passenger> printManifest() { // need to call printmanifest from Car, but how for each car?
        // for (int i = 0; i < nCars; i++) {
        // // Passenger trainCars(i).printCarManifest;
        // }
        return null; // placeholder to prevent errors until I figure out how to do this part,
    }

    // Notes for what we need:
    // -accesors:
    // - `public Engine getEngine()`
    // - `public Car getCar(int i)` to return the `i`th car
    // - `public int getMaxCapacity()` which will return the maximum total capacity
    // across all `Car`s
    // - `public int seatsRemaining()` which will return the number of remaining
    // open seats across all `Car`s
    // - and finally, its own `printManifest()` that prints a roster of all
    // `Passenger`s onboard (_Hint: ask your `Car`s to help!_)z

}