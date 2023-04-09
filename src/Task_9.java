public class Task_9 {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {   // Base case: If k is 0 or equal to n, the coefficient is 1
            return 1;
        } else {   // Recursive case: the coefficient is the sum of the coefficients of the previous two rows in Pascal's triangle
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
}
