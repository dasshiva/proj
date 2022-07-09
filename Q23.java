/* 23. Write a program to input a number and print whether the number is a special
number or not.
(A number is said to be a special number, if the sum of the factorial of the digits of the
number is same as the original number).
Example : 145 is a special number, because 1!+4!+5! = 1 + 24 + 120 = 145 (where !
stands for factorial of the number and the factorial value of a number is the product of
all integers from 1 to that number, example 5! = 1*2*3*4*5 = 120). */

import java.util.Scanner;
public class Q23 {
    public static int getFactorial (int n) { // gets the factorial of the given number
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isSpecial (int num) { // determines whether a number is special or not
        int factSum = 0, copy = num;
        while (num > 0) {
            factSum += getFactorial(num % 10); // get factorial of digit
            num /= 10; // reduce number for next iteration 
        }
        if (copy == factSum) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        sc.close();

        // using ternary operator to reduce code complexity
        System.out.println((isSpecial(c) == true) ? "Special number" : "Not a special number");
    }
}

/* Output (Run 1):
 * Enter a number: 145
 * Special number
 * 
 * Output (Run 2):
 * Enter a number: 290
 * Not a special number
 */