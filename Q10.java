/* 10. A special two-digit number is such that when the sum of its digits is added to the product of its digits, the result is equal to the original two-digit number. Example:
Consider the number 59.
Sum of digits = 5 + 9 = 14
Product of its digits = 5 x 9 = 45
Sum of the sum of digits and product of digits = 14 + 45 = 59
Write a program to accept a two-digit number. Add the sum of its digits to the product of its digits.
If the value is equal to the number input, output the message "Special 2-digit number" otherwise, output the message "Not a special 2-digi number" */

import java.util.Scanner;
public class Q10 { 
	static boolean isSpecial (int n) {
		int dig1 = n / 10, dig2 = n % 10;
		if (((dig1 + dig2) + (dig1 * dig2)) == n)
			return true;
		else
			return false;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		if (isSpecial(n))
			System.out.println("Special 2-digit number");
		else
			System.out.println("Not a special 2-digit number");
			sc.close();
	}
}

/*
 Output (Run 1): 
 Enter number: 59
 Special 2-digit number

 Output (Run 2):
 Enter number: 98
 Not a special 2-digit number
*/
