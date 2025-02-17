public class UserRegistrationTest {
    public static void main(String[] args) {
        testValidRegistration();
        testMissingFields();
        testInvalidEmail();
    }

    public static void testValidRegistration() {
        String name = "John";
        String email = "john@example.com";
        String phone = "1234567890";

        if (!name.isEmpty() && email.contains("@") && phone.length() == 10) {
            System.out.println("Test Passed: Valid registration.");
        } else {
            System.out.println("Test Failed: Invalid registration.");
        }
    }

    public static void testMissingFields() {
        String name = "";
        String email = "john@example.com";
        String phone = "1234567890";

        if (name.isEmpty()) {
            System.out.println("Test Passed: Missing fields detected.");
        } else {
            System.out.println("Test Failed: Missing fields not detected.");
        }
    }

    public static void testInvalidEmail() {
        String email = "invalid-email";

        if (!email.contains("@")) {
            System.out.println("Test Passed: Invalid email detected.");
        } else {
            System.out.println("Test Failed: Invalid email not detected.");
        }
    }
}
