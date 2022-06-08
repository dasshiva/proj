/* 13. Write a program to accept the year of graduation from school as aninteger value from, the user. 
Using the Binary Search technique on the sorted array of integers given below.
Output the message "Record exists", if the value input is located in the array. 
If not, output the message "Record does not exist" .
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010} */

import java.util.Scanner;
public class Q13 {
	static boolean binarySearch(int[] arr, int elem) {
		boolean ret = false;
		int s = 0, l = arr.length;
		int mid = (s + l)/2;
		while (s < l) {
			if (arr[mid] == elem) {
				ret = true;
				break;
			}
			else if (elem > arr[mid]) {
				s = mid + 1;
				mid = (s + l)/2;
			}
			else {
				l = mid - 1;
				mid = (s + l)/2;
			}
		}
		return ret;
	}

	public static void main (String[] args) {
		int[] years = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter graduation year: ");
		int year = sc.nextInt();
		sc.close();
		if (binarySearch(years, year))
			System.out.println("Record exists");
		else
			System.out.println("Record does not exist");
	}
}

/* Output (Run 1): 
Enter graduation year: 1996
Record exists 
 * Output (Run 2):
Enter graduation year: 2011
Record does not exist
 */
