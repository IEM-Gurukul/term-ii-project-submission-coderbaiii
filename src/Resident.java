public class Resident {

    int id;
    String name;
    String contact;
    int apartmentNumber;

    Resident(int id, String name, String contact, int apartmentNumber) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.apartmentNumber = apartmentNumber;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("Apartment: " + apartmentNumber);
    }
}