public class Task_4 {
    public static int factorial(int n) {
        // Check if the number is less than or equal to 1, in which case its factorial is 1
        if (n <= 1) {
            return 1;
        } else {
            // Recursively call the factorial function with n-1, and multiply the result by n
            return factorial(n - 1) * n;
        }
    }
}
