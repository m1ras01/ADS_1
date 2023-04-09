import java.util.Scanner;
public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of problem: ");
        int problem = s.nextInt();
        switch (problem){
            case 1:
                System.out.print("Lenth of array: ");
                int n = s.nextInt();
                System.out.print("Enter the array: ");
                int[] arr = new int[n];
                for(int i = 0 ; i < n ; i ++){
                    arr[i] = s.nextInt();
                }
                System.out.print("Minimum number is: " + Task_1.minNum(arr ,n));
                break;
            case 2:
                System.out.print("Enter length of array: ");
                n = s.nextInt();
                System.out.print("Enter the array: ");
                arr = new int[n];
                for(int i = 0 ; i <n; i++){
                    arr[i] = s.nextInt();
                }
                System.out.print("The average is: " + Task_2.averageNums(arr,n));
                break;
            case 3:
                System.out.print("Enter a number: ");
                n = s.nextInt();
                System.out.print("Your number is: "+Task_3.checkNums(n));
                break;
            case 4:
                System.out.print("Enter a number for the find of factorial: ");
                n = s.nextInt();
                System.out.print("Factorial "+n+"! is: " +Task_4.factorial(n));
                break;
            case 5:
                System.out.print("Enter n-th elements in Fibonacci: ");
                n = s.nextInt();
                System.out.print(n+"-th elements in Fibonacci is: " +Task_5.FastFibonacci(n));
                break;
            case 6:
                System.out.print("Enter a number A: ");
                n = s.nextInt();
                System.out.print("Enter the degree of the number a: ");
                int a = s.nextInt();
                System.out.print("Degree A of n is: "+Task_6.Pow(a,n));
                break;
            case 7:
                System.out.print("Enter length of array: ");
                n = s.nextInt();
                System.out.println("Enter the array: ");
                Task_7.rec(n);
                break;
            case 8:
                System.out.print("Enter a String: ");
                String str = s.nextLine();
                System.out.print("is this all String digit ");
                System.out.println(Task_8.CheckDigit(str));
                break;
            case 9:
                System.out.print("Enter number n:");
                n = s.nextInt();
                System.out.print("Enter number k:");
                int k = s.nextInt();
                System.out.print("binomial coefficient is: "+Task_9.binomialCoefficient(n,k));
                break;
            case 10:
                System.out.println();

        }
    }

}