import java.util.ArrayList;

public class Car {
    int maxCapacity;
    ArrayList<Passenger> passengersOnboard;

    /**
     * this is a constructor for Car objects
     */
    public Car(int naxCapacity) {
        this.maxCapacity = naxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>(maxCapacity);
    }

    /**
     * Reduces currentFuel by 1 for every loop, and if currentFuel > 0, notEmpty =
     * true, otherwise this method returns false
     * 
     * @param Passenger
     * @return T/F if the passenger is able to be added the car or not
     */
    public boolean addPassenger(Passenger p) {
        // check if there's room
        if (this.passengersOnboard.size() >= this.maxCapacity) {
            System.out.println("Car full!");
            return false;
        }
        // check if onboard
        if (this.passengersOnboard.contains(p)) {
            System.out.println("Already onboard!");
            return false;
        }
        this.passengersOnboard.add(p);
        System.out.println("Boarded car!");
        return true;
    }

    /**
     * Reduces currentFuel by 1 for every loop, and if currentFuel > 0, notEmpty =
     * true, otherwise this method returns false
     * 
     * @param Passenger
     * @return boolean T/F if the passenger is able to be added the car or not
     */
    public boolean removePassenger(Passenger p) {
        // check if onboard
        if (!this.passengersOnboard.contains(p)) {
            System.out.println("Passenger isn't on this car!");
            return false;
        }
        this.passengersOnboard.remove(p);
        System.out.println("Departed car!");
        return true;
    }

    /**
     * Getter for the size of the passenger list of a car
     * 
     * @return the size of the car's passenger list
     */
    public int passengerListSize() {
        return passengersOnboard.size();
    }

    /**
     * Reduces currentFuel by 1 for every loop, and if currentFuel > 0, notEmpty =
     * true, otherwise this method returns false
     * 
     * @param int i for the 'for' loop to go through the list
     * @return the car's passenger manifest
     */
    public ArrayList<Passenger> printCarManifest(int i) { // figure out returning vs printing here! ****
        if (passengerListSize() > 0) {
            for (i = 0; i < passengerListSize(); i++) {
                // System.out.println(passengersOnboard.get(i)); // get and print the current
                // passenger matching the loop int "i" that we are on
                System.out.println(passengersOnboard.get(i));
            }
        }
        return passengersOnboard;
    }

    public int carSeatsRemaining() {
        return this.maxCapacity - passengersOnboard.size();
    }
}
