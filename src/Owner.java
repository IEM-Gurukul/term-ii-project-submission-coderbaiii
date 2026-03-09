public class Owner extends Resident {

    boolean ownsApartment;

    Owner(int id, String name, String contact, int apartmentNumber) {
        super(id, name, contact, apartmentNumber);
        this.ownsApartment = true;
    }

    void display() {
        super.display();
        System.out.println("Owner of Apartment");
    }
}
