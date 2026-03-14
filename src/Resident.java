//Resident class represnts a person living in the apartment
 public class Resident {

    int id;
    // Stores resident name
    String name;
    String contact;
    int apartmentNumber;
// Constructor to initialize resident details
    Resident(int id, String name, String contact, int apartmentNumber) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.apartmentNumber = apartmentNumber;
    }
// Displays resident information
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("Apartment: " + apartmentNumber);
    }
}