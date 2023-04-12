 # __Problem 1__
 ### ___Explation:___
 
 #### The code defines a method called `minNum` that takes an integer array `a` and an integer `n` as input. The method recursively searches for the minimum number in the array and returns it. It works by checking if `n` is equal to 1. If it is, the method returns the first element of the array. If `n` is greater than 1, the method recursively calls itself with `n-1` as the new value for `n` and takes the minimum of the returned value and the last element of the array as the result.
<br />

 ### ___Solution:___


```java
public class Task_1 {
    public static int minNum(int[] a, int n) {
        // Check if the length of the array is 1, if yes, return the first element
        if (n == 1)
            return a[0];
        else {
            // Recursively call the function with the length of the array reduced by one
            int min = minNum(a, n - 1);
            // Return the minimum value between the minimum value of the previous subarray and the last element of the current array
            return Math.min(min, a[n - 1]);
        }
    }

}
```
<br />
<br />
<br />



 # __Problem 2__
 ### ___Explanation:___
 The code defines a method called `averageNums` that takes an integer array `a` and an integer `n` as input. The method recursively calculates the average of the first `n` elements of the array and returns it as a double. It works by first checking if `n` is equal to 0. If it is, the method returns 0. If `n` is greater than 0, the method recursively calls itself with `n-1` as the new value for `n` and multiplies the result by `n-1`. It then adds the `n`-th element of the array to the sum and returns the sum divided by `n`.

 <br />

 ### ___Solution:___
 ```java
 public class Task_2 {
    public static double averageNums(int[] a, int n) {
        // Base case: if the length of the array is 0, return 0 as the average
        if (n == 0) {
            return 0;
        }
        // Recursively call the function with the length of the array reduced by one, and multiply it by the previous number of elements
        double sum = averageNums(a, n - 1) * (n - 1);
        // Add the last element of the array to the sum
        sum += a[n - 1];
        // Return the average of the array, which is the sum divided by the number of elements
        return sum / n;
    }
}
```

<br />
<br />
<br />

# __Problem 3__
### ___Explanation:___
The code defines a method called `checkNums` that takes an integer `n` as input. The method checks if the input number is prime or composite and returns a string with the result. It works by first checking if `n` is equal to 2 or 3. If it is, the method returns "Prime". If `n` is not divisible by 2 or 3, the method returns "Prime". Otherwise, the method returns "Composite".

<br/>

### ___Solution:___
```java
public class Task_3 {
    public static String checkNums(int n) {
        // Initialize variables to indicate whether the number is prime or composite
        String p = "Prime";
        String C = "Composite";

        // Check if the number is 2 or 3, which are prime numbers
        if (n == 2) {
            return p;
        } else if (n == 3) {
            return p;
            // Check if the number is divisible by 2 or 3, if not, it is a prime number
        } else if (n % 3 != 0 && n % 2 != 0) {
            return p;
        } else {
            // Otherwise, the number is composite
            return C;
        }
    }
}
```
<br/>
<br/>
<br/>


# __Problem 4__
### ___Explanation:___
The code defines a method called `factorial` that takes an integer `n` as input. The method recursively calculates the factorial of `n` and returns it as an integer. It works by first checking if `n` is less than or equal to 1. If it is, the method returns 1. Otherwise, the method recursively calls itself with `n-1` as the new value for `n` and multiplies the result by `n`.

<br/>

### ___Solution:___
```java
public class Task_4 {
    public static int factorial(int n) {
        // Check if the number is less than or equal to 1, in which case its factorial is 1
        if (n <= 1) {
            return 1;
        } else {
            // Recursively call the factorial function with n-1, and multiply the result by n
            return factorial(n - 1) * n;
        }
    }
}
```

<br/>
<br/>
<br/>


# __Problem 5__
### ___Explanation:___
The code defines a method called `FastFibonacci` that takes an integer `n` as input. The method uses an array to store the Fibonacci sequence up to the `n`-th element and returns the `n`-th element of the sequence as a long. It works by initializing an array of length `n+1` with the first two elements of the Fibonacci sequence. It then iteratively calculates each subsequent element of the sequence by summing the previous two elements of the sequence.

<br/>

### ___Solution:___
```java
public class Task_5 {
    public static long FastFibonacci(int n) {
        // Create an array to store the Fibonacci numbers up to n
        long[] arr = new long[n + 1];
        // Set the first two elements of the array to 0 and 1
        arr[0] = 0;
        arr[1] = 1;
        // Loop through the array and fill it with the Fibonacci numbers
        for(int i = 2 ; i <= n; i++) {
            // Each Fibonacci number is the sum of the previous two Fibonacci numbers
            arr[i] = arr[i-1] + arr[i-2];
        }
        // Return the n-th Fibonacci number
        return arr[n];
    }
}
```

<br/>
<br/>
<br/>


# __Problem 6__
### ___Explanation:___
The code defines a method called `Pow` that takes two integers `a` and `n` as input. The method recursively calculates `a` raised to the power of `n` and returns it as an integer. It works by first checking if `n` is equal to 0. If it is, the method returns 1. Otherwise, the method recursively calls itself with `n-1` as the new value for `n` and multiplies the result by `a`.

 <br/>

 ### ___Solution:___
 ```java
 public class Task_6 {
    public static int Pow(int a, int n) {
        if (n == 0) {        // if n is 0, return 1 because any number raised to the power of 0 is 1
            return 1;
        } else {
            return a * Pow(a, n - 1); // if n is not 0, recursively calculate a^n-1 and multiply the result by a
        }
    }
}
```

<br/>
<br/>
<br/>

# __Solution 7__
### ___Explanation:___
This code snippet is `a` recursive method that takes an integer `a` as input and prompts the user to input a more integers. It then prints out the `a` integers in reverse order. The code uses a Scanner object to read user input from the console.
The `rec` method first checks if the input integer `a` is not equal to 0. If it is not 0, the method reads an integer using the Scanner object and then calls itself recursively with the value of `a-1`. This continues until `a` reaches 0. Once `a` is equal to 0, the method returns and the integers are printed out in reverse order.

<br/>

### ___Solution:___
```java
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
```

<br/>
<br/>
<br/>

# __Problem 8__
### ___Explanation:___

This code snippet is a recursive method that takes a String `str` as input and checks if the first character of the String is a digit. If it is, the method calls itself recursively with the substring of `str` starting from the second character. If the first character is not a digit, the method returns "No". The method returns "Yes" if the input string is empty.
The `CheckDigit` method first checks if the length of the input string `str` is 0. If it is, the method returns "Yes". Otherwise, it checks if the first character of `str` is a digit. If it is, the method calls itself recursively with the substring of `str` starting from the second character. If the first character is not a digit, the method returns "No".

<br/>

### ___Solution:___
```java
public class Task_8 {
    public static String CheckDigit(String str) {
        if (str.length() == 0) { // base case: the string is empty
            return "Yes"; // since the string is empty, it must contain only digits
        }
        if (Character.isDigit(str.charAt(0))) { // if the first character is a digit
            return CheckDigit(str.substring(1)); // check the rest of the string recursively
        } else { // if the first character is not a digit
            return "No"; // the string does not contain only digits
        }
    }
}
```

<br/>
<br/>
<br/>

# __Problem 9__

### ___Explanation___

This method calculates the binomial coefficient of `n` and `k` using recursion. If `k` is equal to 0 or `n`, the method returns 1. Otherwise, it recursively calls itself with the parameters `n-1` and `k-1`, and `n-1` and `k`, and returns their sum.

<br/>

### ___Solution:___
```java
public class Task_9 {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {   // Base case: If k is 0 or equal to n, the coefficient is 1
            return 1;
        } else {   // Recursive case: the coefficient is the sum of the coefficients of the previous two rows in Pascal's triangle
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
}
```

<br/>
<br/>
<br/>

# __Problem 10__
### ___Explanation:___
This code snippet is a recursive method that calculates the greatest common divisor (GCD) of two input integers `n` and `k`. The GCD is the largest positive integer that divides both `n` and `k` without leaving a remainder.
The `GCD` method first checks if `k` is equal to 0. If it is, the method returns `n` since the GCD of `n` and 0 is `n`. Otherwise, the method calculates the remainder `r` when `n` is divided by `k` and then calls itself recursively with `k` and `r`. This continues until `k` is equal to 0, at which point the method returns the value of `n`. The GCD is calculated using the Euclidean algorithm, which is a well-known algorithm for computing the GCD of two numbers.

<br/>
 
 ### ___Solution:___
 ```java
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
```

<br/>

![](https://c.tenor.com/5GmWzNk994gAAAAC/thank-you-obama.gif)
