public class Task_1 {
    public static int minNum(int[] a, int n) {
        // Check if the length of the array is 1, if yes, return the first element
        if (n == 1)
            return a[0];
        else {
            // Recursively call the function with the length of the array reduced by one
            int min = minNum(a, n - 1);
            // Return the minimum value between the minimum value of the previous subarray and the last element of the current array
            return Math.min(min, a[n - 1]);
        }
    }

}
