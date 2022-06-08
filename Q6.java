/* 6. Write a program in Java to store 20 numbers (even and odd numbers) in a Single
Dimensional Array (SDA). Calculate and display the sum of all even numbers and all
odd numbers separately. */

import java.util.Scanner;

public class Q6 {
    public static boolean isOdd(int n) {
        if (n % 2 != 0)
            return true;
        return false;
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 20;
        int[] arr = new int[len];
        for (int i = 0; i < len; i ++) { 
            System.out.print("Enter number : ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        int odd = 0, even = 0;
        for (int i = 0; i < 20; i++) {
            if (isOdd(arr[i])) {
                odd += arr[i];
            }
            else
                even += arr[i];
        }
        System.out.println("Sum of odd numbers: " + odd);
        System.out.println("Sum of even numbers : " + even);
    }
}

/* Output (Run 1) :
Enter number : 23
Enter number : 91
Enter number : 39 
Enter number : 102
Enter number : 2010
Enter number : 2029
Enter number : 3991
Enter number : 20293
Enter number : 10022
Enter number : 9392
Enter number : 23221
Enter number : 2333 
Enter number : 4412
Enter number : 2332
Enter number : 21123
Enter number : 23212
Enter number : 232
Enter number : 2321
Enter number : 4432
Enter number : 2323
Sum of odd numbers: 77787
Sum of even numbers : 56146

Output (Run 2) :
Enter number : 34434
Enter number : 54342 
Enter number : 93839
Enter number : 29923
Enter number : 32341
Enter number : 234022
Enter number : 33322
Enter number : 23011
Enter number : 32312
Enter number : 21312
Enter number : 23931
Enter number : 32322
Enter number : 23232
Enter number : 23298
Enter number : 90223
Enter number : 78021
Enter number : 90123
Enter number : 32309
Enter number : 23102 
Enter number : 99082
Sum of odd numbers: 493721
Sum of even numbers : 610780
*/