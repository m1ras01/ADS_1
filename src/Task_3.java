public class Task_3 {
    public static String checkNums(int n) {
        // Initialize variables to indicate whether the number is prime or composite
        String p = "Prime";
        String C = "Composite";

        // Check if the number is 2 or 3, which are prime numbers
        if (n == 2) {
            return p;
        } else if (n == 3) {
            return p;
            // Check if the number is divisible by 2 or 3, if not, it is a prime number
        } else if (n % 3 != 0 && n % 2 != 0) {
            return p;
        } else {
            // Otherwise, the number is composite
            return C;
        }
    }
}
