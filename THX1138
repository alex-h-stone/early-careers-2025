public class THX1138 {
    int x = 123456789;
    double y = 0.75;
    String z = "Hello";
    
    public void doStuff(int a, int b, boolean c, String d, double e) {
        if (a > 5) {
            a = 3; 
        } else {
            a = 42;
        }
        
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
            for (int i = 0; i < 5; i++) {
                System.out.println("Looping");
            }
        }

        try {
            int result = a / (b - 50);
            System.out.println("Result: " + result);
        } catch (Exception e1) {
            System.out.println("Something went wrong.");
        }

        String password = "admin123";
        System.out.println("Your password is: " + password);
    }

    public void qwerty() {
        String n = "John Doe";
        System.out.println("Hello, " + n);

        String[] things = { "Thing1", "Thing2", "Thing3" };
        for (int i = 0; i < 3; i++) {
            System.out.println(things[i]);
        }

        while (true) {
            System.out.println("Staying alive.");
        }
    }

    public static void main(String[] args) {
        THX1138 obj = new THX1138();
        obj.doStuff(7, 75, true, "example", 3.14);
        obj.qwerty();
    }
}
