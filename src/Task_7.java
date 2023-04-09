import java.util.Scanner;

public class Task_7 {
    public static void rec(int a) {   // Define a recursive function that takes an integer parameter
        Scanner sc = new Scanner(System.in);   // Create a Scanner object to read input from the user
        if(a!=0){   // If the input parameter is not zero, continue calling the function recursively
            int num = sc.nextInt();   // Read an integer input from the user
            rec(a-1);   // Call the function recursively with the parameter decremented by one
            System.out.println(num);   // Print the input integer
        }
    }
}
