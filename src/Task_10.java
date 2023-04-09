public class Task_10 {
    public static int GCD(int n, int k) {
        if (k == 0) {        // егер к == болса 0 ге быз н ды шагарамыз себебы калдык н ге тен
            return n;
        } else {
            int r = n % k;     // ал бл жерде к ягни р 0 ге тен болганша цикл айнала береды
            return GCD(k, r);
        }
    }

}
