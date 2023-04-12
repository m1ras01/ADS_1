
 # __Problem 1__
 ### ___Explation:___
 
 #### The code defines a method called `minNum` that takes an integer array `a` and an integer `n` as input. The method recursively searches for the minimum number in the array and returns it. It works by checking if `n` is equal to 1. If it is, the method returns the first element of the array. If `n` is greater than 1, the method recursively calls itself with `n-1` as the new value for `n` and takes the minimum of the returned value and the last element of the array as the result.

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




 # __Problem 2__
 ### ___Explanation:___
 The code defines a method called averageNums that takes an integer array a and an integer n as input. The method recursively calculates the average of the first n elements of the array and returns it as a double. It works by first checking if n is equal to 0. If it is, the method returns 0. If n is greater than 0, the method recursively calls itself with n-1 as the new value for n and multiplies the result by n-1. It then adds the n-th element of the array to the sum and returns the sum divided by n.
