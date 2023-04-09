public class Task_5 {
    public static long FastFibonacci(int n) {
        // Create an array to store the Fibonacci numbers up to n
        long[] arr = new long[n + 1];
        // Set the first two elements of the array to 0 and 1
        arr[0] = 0;
        arr[1] = 1;
        // Loop through the array and fill it with the Fibonacci numbers
        for(int i = 2 ; i <= n; i++) {
            // Each Fibonacci number is the sum of the previous two Fibonacci numbers
            arr[i] = arr[i-1] + arr[i-2];
        }
        // Return the n-th Fibonacci number
        return arr[n];
    }
}
