/* 8. Write a program by using a class with the following specifications:
Class name - Calculate
Instance variables:
int num
int f
int rev
Member Methods:
Calculate(int n) - to initialize num with n, f and rev with 0 (zero)
int prime() - to return 1, if number is prime
int reverse() -  to return reverse of the number
void display() - to check and print whether the number is a prime palindrome
or not.
*/

import java.util.Scanner;
public class Calculate { 
	int num, f, rev;
	Calculate (int n) {
		num = n;
		f = 0;
		rev = 0;
	}

	int prime() {
		if (num == 1 || num == 0) {
			System.out.println("0 and 1 are neither prime nor composite!");
			return f;
		}
		f = 1;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				f = 0;
				break;
			}
		}
		return f;
	}

	int reverse() {
		int c = num;
		while (c > 0) {
			int digit = c % 10;
			rev = rev * 10 + digit;
			c /= 10;
		}
		return rev;
	}

	void display() {
		if (f == 1 && num == rev) 
			System.out.println("Number is a prime palindrome");
		else
			System.out.println("Number is not a prime palindrome number");
	}
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		in.close();
		Calculate obj = new Calculate(n);
		if (obj.prime() == 1)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
		System.out.println("Reversed number is : " + obj.reverse());
		obj.display();
	}
}

/* Output (Run 1):
 Enter a number: 34
 Number is not prime
 Reversed number is : 43
 Number is not a prime palindrome number

 * Output (Run 2):
 Enter a number: 797
 Number is prime
 Reversed number is : 797
 Number is a prime palindrome 
*/
