public class Owner extends Resident {

    boolean ownsApartment;
        // Constructor to initialize owner details

    Owner(int id, String name, String contact, int apartmentNumber) {
        super(id, name, contact, apartmentNumber);
        this.ownsApartment = true;
    }
    // Displays owner information

    void display() {
        super.display();
        System.out.println("Owner of Apartment");
    }
}
