public class Apartment {

    int apartmentNumber;
    boolean occupied;

    Apartment(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
        this.occupied = false;
    }

    void display() {
        System.out.println("Apartment Number: " + apartmentNumber);
        System.out.println("Occupied: " + occupied);
    }
}