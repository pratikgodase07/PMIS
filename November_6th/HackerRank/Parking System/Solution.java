import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// The ParkingSystem class handles the slots and car parking logic
class ParkingSystem {
    // Member variables to keep track of available slots for each type
    int big;
    int medium;
    int small;

    // Constructor to initialize slots for big, medium, and small cars
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    // Checks if a space is available for the given carType (1 = big, 2 = medium, 3 = small)
    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big > 0) {
                big--; // Park the car by reducing available slot count
                return true;
            }
        } else if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            }
        } else if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            }
        }
        return false; // No available slot found
    }
}

public class Solution {
    public static void main(String args[]) throws Exception {
        /* Example Usage */
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);[cite: 3]
        
        System.out.println(parkingSystem.addCar(1)); // true (1 available slot for big)
        System.out.println(parkingSystem.addCar(2)); // true (1 available slot for medium)[cite: 3]
        System.out.println(parkingSystem.addCar(3)); // false (0 available slots for small)[cite: 3]
        System.out.println(parkingSystem.addCar(1)); // false (big car slot is already occupied)[cite: 3]
    }
}