import java.util.ArrayList;

public class Car {
    int maxCapacity;
    ArrayList<Passenger> passengersOnboard;

    /**
     * this is a constructor for Car objects
     */
    public Car(int carMaxCapacity) {
        this.maxCapacity = carMaxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>(carMaxCapacity);
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

    public static void main(String[] args) {
        Car c = new Car(10);
    }
}