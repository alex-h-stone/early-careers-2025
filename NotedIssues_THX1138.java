public class THX1138 {
    // Global variables (bad practice)
    int x = 123456789; // What is this for?
    double y = 0.75; // Arbitrary value
    String z = "Hello"; // Unused variable
    
    // Extremely long, confusing method
    public void doStuff(int a, int b, boolean c, String d, double e) {
        // Magic numbers & unclear logi
        if (a > 5) {
            a = 3; 
        } else {
            a = 42;
        }
        
        // Deeply nested conditions (bad readability)
        if (c) {
            if (b < 100) {
                if (b > 50) {
                    System.out.println("B is between 50 and 100.");
                } else {
                    if (b > 25) {
                        System.out.println("B is between 25 and 50.");
                    } else {
                        System.out.println("B is very small.");
                    }
                }
            }
        } else {
            for (int i = 0; i < 5; i++) { // Pointless loop
                System.out.println("Looping");
            }
        }

        // Bad exception handling (catching everything!)
        try {
            int result = a / (b - 50); // Potential division by zero
            System.out.println("Result: " + result);
        } catch (Exception e1) {
            System.out.println("Something went wrong.");
        }

        // Security vulnerability (storing password in plain text)
        String password = "admin123";
        System.out.println("Your password is: " + password);
    }

    // Poorly named method that does multiple unrelated things
    public void qwerty() {
        String n = "John Doe";
        System.out.println("Hello, " + n); // Useless print statement

        // Hardcoded list (should be a database or config file)
        String[] things = { "Thing1", "Thing2", "Thing3" };
        for (int i = 0; i < 3; i++) {
            System.out.println(things[i]);
        }

        // Infinite loop (dangerous!)
        while (true) {
            System.out.println("Staying alive");
        }
    }

    public static void main(String[] args) {
        THX1138 obj = new THX1138();
        obj.doStuff(7, 75, true, "example", 3.14);
        obj.qwerty();
    }
}
