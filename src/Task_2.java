public class Task_2 {
    public static double averageNums(int[] a, int n) {
        // Base case: if the length of the array is 0, return 0 as the average
        if (n == 0) {
            return 0;
        }
        // Recursively call the function with the length of the array reduced by one, and multiply it by the previous number of elements
        double sum = averageNums(a, n - 1) * (n - 1);
        // Add the last element of the array to the sum
        sum += a[n - 1];
        // Return the average of the array, which is the sum divided by the number of elements
        return sum / n;
    }
}
