 public class Tenant extends Resident {

    int rent;

    Tenant(int id, String name, String contact, int apartmentNumber, int rent) {
        super(id, name, contact, apartmentNumber);
        this.rent = rent;
    }

    void display() {
        super.display();
        System.out.println("Rent: " + rent);
    }
}
