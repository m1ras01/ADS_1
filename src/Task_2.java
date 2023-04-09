public class Task_2 {
    public static double averageNums(int[] a, int n) {
        if (n == 0) {                                                                 // егер ө ге тең болса
            return 0;                                                                // ө ді шығарамыз
        }                                                                           //
        double sum = averageNums(a, n - 1) *(n-1);                                 //   тең болмаса н азайып отыра береді и функция аяқталған кезде н керысынше койылып функция ары карай орындалып кетеды
        sum += a[n - 1];                                                          //
        return sum / n;                                                          //
    }

}
