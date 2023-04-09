import java.util.Scanner;
public class Task_7 {
    public static void rec(int a) {
        Scanner sc = new Scanner(System.in);
        if(a!=0){
            int num = sc.nextInt();
            rec(a-1);                                                     // бызде бул типа циклдын ышындегы условия ретынде караймыз сан 0 ге жетпегенше токтамайды

            System.out.println(num);                                         // бызде н нын орнын дагы сандары артынан бастап окыгандыктан керысынше жауап ала аламыз
        }
    }
}
