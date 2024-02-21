public class Engine {

    // attributes
    private double currentFuel;
    private double maxFuel;
    private boolean notEmpty;

    // methods
    public Engine(FuelType other, double maxFuel, double currentFuel) {
        this.maxFuel = maxFuel;
        this.currentFuel = 100;
    }

    /**
     * refuel engine by setting currentFuel to maxFuel
     * 
     * @param currentFuel
     */
    public void refuel(double currentFuel) {
        this.currentFuel = this.maxFuel;
    }

    /**
     * Reduces currentFuel by 1 for every loop, and if currentFuel > 0, notEmpty = true, otherwise this method returns false
     * @return notEmpty bool T/F: is fuel > 0?
     */
    private boolean go() {
        notEmpty = true;
        if (notEmpty) {
            this.currentFuel -= 1;
            System.out.println("Current Fuel:" + currentFuel);
            if (currentFuel == 0.0) {
                notEmpty = false;}
        }
        return notEmpty;
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.STEAM, 100.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}
