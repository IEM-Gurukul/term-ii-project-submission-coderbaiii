 public class Tenant extends Resident {

    int rent;
        // Constructor to initialize tenant details


    Tenant(int id, String name, String contact, int apartmentNumber, int rent) {
        super(id, name, contact, apartmentNumber);
        this.rent = rent;
    }
    // Displays tenant information


    void display() {
        super.display();
        System.out.println("Rent: " + rent);
    }
}
