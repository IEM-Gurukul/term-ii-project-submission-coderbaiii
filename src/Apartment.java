public class Apartment {
// Stores apartment number
    int apartmentNumber;
    boolean occupied;

    // Constructor to initialize apartment data

    Apartment(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
        this.occupied = false;
    }
  // Displays apartment details
    void display() {
        System.out.println("Apartment Number: " + apartmentNumber);
        System.out.println("Occupied: " + occupied);
    }
}