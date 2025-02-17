public class VehicleTypeTest {
    public static void main(String[] args) {
        testTwoWheeler();
        testFourWheeler();
        testMissingVehicleType();
    }

    public static void testTwoWheeler() {
        String vehicleType = "two-wheeler";
        if (vehicleType.equals("two-wheeler")) {
            System.out.println("Test Passed: Two-wheeler selected.");
        } else {
            System.out.println("Test Failed: Incorrect vehicle type.");
        }
    }

    public static void testFourWheeler() {
        String vehicleType = "four-wheeler";
        if (vehicleType.equals("four-wheeler")) {
            System.out.println("Test Passed: Four-wheeler selected.");
        } else {
            System.out.println("Test Failed: Incorrect vehicle type.");
        }
    }

    public static void testMissingVehicleType() {
        String vehicleType = "";
        if (vehicleType.isEmpty()) {
            System.out.println("Test Passed: Missing vehicle type detected.");
        } else {
            System.out.println("Test Failed: Vehicle type should be empty.");
        }
    }
}
