public class DistanceCalculationTest {
    public static void main(String[] args) {
        testValidDistance();
        testSameCoordinates();
        testInvalidCoordinates();
    }

    public static void testValidDistance() {
        double distance = calculateDistance(28.7041, 77.1025, 28.5355, 77.3910);
        if (distance > 0) {
            System.out.println("Test Passed: Valid distance calculated: " + distance + " km.");
        } else {
            System.out.println("Test Failed: Distance calculation incorrect.");
        }
    }

    public static void testSameCoordinates() {
        double distance = calculateDistance(28.7041, 77.1025, 28.7041, 77.1025);
        if (distance == 0) {
            System.out.println("Test Passed: Distance is zero for same coordinates.");
        } else {
            System.out.println("Test Failed: Incorrect distance for same coordinates.");
        }
    }

    public static void testInvalidCoordinates() {
        try {
            calculateDistance(91, 181, 28.5355, 77.3910);
            System.out.println("Test Failed: Invalid coordinates not detected.");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Passed: Invalid coordinates detected.");
        }
    }

    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        if (lat1 < -90 || lat1 > 90 || lon1 < -180 || lon1 > 180 || lat2 < -90 || lat2 > 90 || lon2 < -180 || lon2 > 180) {
            throw new IllegalArgumentException("Invalid coordinates.");
        }
        // Haversine formula
        double R = 6371;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }
}
