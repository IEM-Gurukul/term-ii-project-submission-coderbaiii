import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Resident> residents = new ArrayList<>();
    static ArrayList<Apartment> apartments = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        initializeApartments();

        int choice;

        while (true) {

            System.out.println("\n===== Apartment Management System =====");
            System.out.println("1 Add Resident");
            System.out.println("2 View Residents");
            System.out.println("3 Remove Resident");
            System.out.println("4 Search Resident");
            System.out.println("5 View Available Apartments");
            System.out.println("6 Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addResident();
                    break;

                case 2:
                    viewResidents();
                    break;

                case 3:
                    removeResident();
                    break;

                case 4:
                    searchResident();
                    break;

                case 5:
                    viewAvailableApartments();
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void initializeApartments() {

        for (int i = 101; i <= 110; i++) {
            apartments.add(new Apartment(i));
        }
    }

    static void addResident() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Contact: ");
        String contact = sc.nextLine();

        System.out.print("Enter Apartment Number: ");
        int apt = sc.nextInt();

        for (Apartment a : apartments) {

            if (a.apartmentNumber == apt) {

                if (a.occupied) {
                    System.out.println("Apartment already occupied!");
                    return;
                }

                a.occupied = true;

                Resident r = new Resident(id, name, contact, apt);
                residents.add(r);

                System.out.println("Resident added successfully.");
                return;
            }
        }

        System.out.println("Apartment does not exist.");
    }

    static void viewResidents() {

        if (residents.isEmpty()) {
            System.out.println("No residents found.");
            return;
        }

        for (Resident r : residents) {
            r.display();
            System.out.println();
        }
    }

    static void removeResident() {

        System.out.print("Enter Resident ID to remove: ");
        int id = sc.nextInt();

        for (int i = 0; i < residents.size(); i++) {

            if (residents.get(i).id == id) {

                int apt = residents.get(i).apartmentNumber;

                for (Apartment a : apartments) {
                    if (a.apartmentNumber == apt) {
                        a.occupied = false;
                    }
                }

                residents.remove(i);

                System.out.println("Resident removed.");
                return;
            }
        }

        System.out.println("Resident not found.");
    }

    static void searchResident() {

        System.out.print("Enter Resident ID: ");
        int id = sc.nextInt();

        for (Resident r : residents) {

            if (r.id == id) {
                System.out.println("Resident Found:");
                r.display();
                return;
            }
        }

        System.out.println("Resident not found.");
    }

    static void viewAvailableApartments() {

        for (Apartment a : apartments) {

            if (!a.occupied) {
                System.out.println("Apartment " + a.apartmentNumber + " is available.");
            }
        }
    }
}