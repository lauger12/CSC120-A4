public class Passenger {

    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Getter for name
     * 
     * @return the passenger's name
     */
    public String getName() {
        return this.name;
    }

    public boolean boardCar(Car c) {
        if (!c.addPassenger(this)) {
            System.out.println("Could not board car");
            return false;
        }
        System.out.println("Successfully boarded car");
        return true;
    }

    public boolean exitCar(Car c) {
        if (!c.removePassenger(this)) {
            System.out.println("Could not exit car");
            return false;
        }
        System.out.println("Successfully left car");
        return true;
    }
}
