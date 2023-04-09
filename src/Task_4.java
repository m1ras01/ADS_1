public class Task_4 {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;   // кері қарай н нын сандарын керы карай койып көбейтіліп отыра береді
        }                                     // мысалы 3 ты енгыссек (1*2)= 2 * 3  = 6
    }
}
