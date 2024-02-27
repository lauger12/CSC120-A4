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

    public int passengerListSize() {
        return passengersOnboard.size();
    }

    public Passenger printCarManifest(int i) {
        if (passengerListSize() > 0) {
            for (i = 0; i < passengerListSize(); i++) {
                // System.out.println(passengersOnboard.get(i)); // get and print the current
                // passenger matching the loop int "i" that we are on
                System.out.println(passengersOnboard.get(i)); 
            }
        }
        return passengersOnboard.get(i);
    }

    public int carSeatsRemaining(){
        return this.maxCapacity - passengersOnboard.size();  
    }
}
