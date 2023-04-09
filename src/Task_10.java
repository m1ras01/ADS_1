public class Task_10 {
    // This is a static method named "GCD" which takes two integer arguments: "n" and "k"
// This method calculates and returns the greatest common divisor (GCD) of "n" and "k"
    public static int GCD(int n, int k) {

        // If "k" is equal to zero, then "n" is the GCD of "n" and "k"
        if (k == 0) {
            return n;
        }
        // Otherwise, calculate the remainder of "n" divided by "k" and recursively call GCD method
        // with arguments "k" and the remainder until "k" becomes zero
        else {
            int r = n % k;
            return GCD(k, r);
        }
    }


}
