// Custom exception for resident not found errors
public class ResidentNotFoundException extends Exception {
    // Constructor to pass exception message
    public ResidentNotFoundException(String message) {
        super(message);
    }
}
