/* 15. The International Standard Book Number (ISBN) is a unique numeric book identifier which is printed on every book. The ISBN is based upon a 10-digit code. The ISBN is legal if:
1 × digit1 + 2 × digit2 + 3 × digit3 + 4 × digit4 + 5 × digit5 + 6 × digit6 + 7 × digit7 + 8 × digit8 + 9 × digit9 + 10 × digit10 is divisible by 11.
Example : For an ISBN 1401601499
Sum = 1×1 + 2×4 +3×0 + 4×1 + 5×6 + 6×0 + 7×1 + 8×4 + 9×9 + 10×9 = 253 which is
divisible by 11.
Write a program to :
(i) Input the ISBN code as a 10-digit integer.
(ii) If the ISBN is not a 10-digit integer, output the message, “Illegal ISBN” and
terminate the program.
(iii) If the number is 10-digit, extract the digits of the number and compute the sum as explained above.
If the sum is divisible by 11, output the message, “Legal ISBN”. If the sum is not
divisible by 11, output the message, “Illegal ISBN”. */

import java.util.Scanner;
public class Q15 {
	static boolean verify(int ISBN) {
		int digs = 0;
		while (ISBN > 0) {
			digs++;
			ISBN /= 10;
		}
		if (digs != 10)
			return false;
		else
			return true;
	}

	static boolean isISBN (int ISBN) {
		int sum = 0, multiplier = 1;
		while (ISBN > 0) {
			int digit = ISBN % 10;
			sum += multiplier * digit;
			ISBN /= 10;
			multiplier++;
		}
		if (sum % 11 != 0)
			return false;
		else
			return true;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ISBN: ");
		int ISBN = sc.nextInt();
		sc.close();
		if (verify(ISBN)) {
			if (isISBN(ISBN))
				System.out.println("Legal ISBN");
			else
				System.out.println("Illegal ISBN");
		}
		else 
			System.out.println("Illegal ISBN");
	}
}

/* Output (Run 1):
 Enter ISBN: 1401601499
 Legal ISBN

 * Output (Run 2):
 Enter ISBN: 1828822899
 Illegal ISBN
*/
