public class Task_6 {
    public static int Pow(int a, int n) {
        if (n == 0) {        // if n is 0, return 1 because any number raised to the power of 0 is 1
            return 1;
        } else {
            return a * Pow(a, n - 1); // if n is not 0, recursively calculate a^n-1 and multiply the result by a
        }
    }
}
