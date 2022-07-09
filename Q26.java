/* 26. A double dimensional array is defined as N[4][4] to store numbers. Write a
program to find the sum of all even numbers and product of all odd numbers
of the elements stored in Double Dimensional Array (DDA).
Sample Input:
12 10 15 17
30 11 32 71
17 14 29 31
41 33 40 51
Sample Output:
Sum of all even numbers: ..........
Product of all odd numbers: .......... */

import java.util.Scanner;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] dda = new int[4][4];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < 4; i++) { // nested loop to get input into the double dimensional array
            for (int j = 0; j < 4; j++) { 
                dda[i][j] = sc.nextInt();
            }
        }
        sc.close();

        long oddProd = 1; // oddProd is a long because it needs to store a large product which may overflow the size of int 
        int evenSum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) { // nested to loop to calaculate
                int num = dda[i][j];
                if ((num % 2) != 0) // if number is odd, multiply it with accumulator oddProd
                oddProd *= num;
                else // if number is even, add it to accumulator evenSum
                evenSum += num;
            }
        }

        System.out.println("Sum of all even numbers is: " + evenSum);
        System.out.println("Product of all odd number is: " + oddProd);

    }
}

/* Output (Run 1):
 * Enter numbers: 12
 * 10
 * 15
 * 17
 * 30
 * 11
 * 32
 * 71
 * 17
 * 14
 * 29
 * 31
 * 41
 * 33
 * 40
 * 51
 * Sum of all even numbers is: 138
 * Product of all odd number is: 210023455742595
 * 
 * Output (Run 2):
 * Enter numbers: 34 
 * 12
 * 30
 * 23
 * 35
 * 19
 * 84
 * 10
 * 49
 * 91
 * 42
 * 44
 * 39
 * 98
 * 11
 * 28
 * Sum of all even numbers is: 382
 * Product of all odd number is: 29257973745
 */