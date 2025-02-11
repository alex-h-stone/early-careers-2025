import java.util.List;

public class UserAccountService {
    private static final int DEFAULT_DISCOUNT_THRESHOLD = 50;
    private static final double DISCOUNT_RATE = 0.10; // 10% discount
    private static final String MASKED_PASSWORD = "********"; // Prevents security issues

    // Method to calculate discount based on user loyalty points
    public double calculateDiscount(double price, int loyaltyPoints) {
        if (loyaltyPoints >= DEFAULT_DISCOUNT_THRESHOLD) {
            return price * (1 - DISCOUNT_RATE);
        }
        return price;
    }

    // Method to validate user input
    public boolean isValidUserInput(String input) {
        return input != null && !input.trim().isEmpty();
    }

    // Method to securely display user information
    public void displayUserInfo(String username, String password, List<String> items) {
        if (!isValidUserInput(username)) {
            System.out.println("Error: Invalid username.");
            return;
        }

        System.out.println("Welcome, " + username);
        System.out.println("Your password is securely stored as: " + MASKED_PASSWORD);
        System.out.println("Your purchased items:");
        
        for (String item : items) {
            System.out.println("- " + item);
        }
    }

    public static void main(String[] args) {
        UserAccountService service = new UserAccountService();
        
        // Example user data
        String username = "John Doe";
        String password = "securePassword123"; // This should never be stored in plaintext
        List<String> userItems = List.of("Laptop", "Mouse", "Keyboard");
        
        double originalPrice = 100.0;
        int loyaltyPoints = 60;
        
        double discountedPrice = service.calculateDiscount(originalPrice, loyaltyPoints);
        System.out.println("Final Price After Discount: $" + discountedPrice);

        // Display user information
        service.displayUserInfo(username, password, userItems);
    }
}
