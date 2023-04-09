public class Task_5 {
    public static long FastFibonacci(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2 ; i <= n; i++)    // ал бл жолда керысынше быз массив аркылы фибоначи сандарын толыктырып отырамыз
            arr[i] = arr[i-1]+ arr[i-2];

        return arr[n];


    }
}
