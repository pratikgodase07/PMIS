class ParkingSystem {
    // Variables to store remaining spots for each car type
    private int big;
    private int medium;
    private int small;

    // Constructor to initialize the parking lot capacity
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    // Method to attempt parking a car
    public boolean addCar(int carType) {
        // carType 1 = Big
        if (carType == 1) {
            if (this.big > 0) {
                this.big--; // Take one big spot
                return true;
            }
        } 
        // carType 2 = Medium
        else if (carType == 2) {
            if (this.medium > 0) {
                this.medium--; // Take one medium spot
                return true;
            }
        } 
        // carType 3 = Small
        else if (carType == 3) {
            if (this.small > 0) {
                this.small--; // Take one small spot
                return true;
            }
        }

        // If no spots are available for the given carType
        return false;
    }
}

/**
 * Example Usage:
 * ParkingSystem obj = new ParkingSystem(1, 1, 0);
 * boolean param_1 = obj.addCar(1); // returns true (1 big spot remaining -> 0)
 * boolean param_2 = obj.addCar(1); // returns false (0 big spots remaining)
 * boolean param_3 = obj.addCar(3); // returns false (0 small spots available)
 */