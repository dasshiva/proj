/* 35.Write a program to accept 10 names in a Single Dimensional Array (SDA). Display
the names whose first letter matches with the letter entered by the user.
Sample Input:
Aman Shahi
Akash Gupta
Suman Mishra
and so on ..........
Sample Output:
Enter the alphabet: A
Aman Shahi
Akash Gupta */

import java.util.Scanner;
public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10]; // initiliaze the backing array
        System.out.print("Enter the names: "); 
        for (int i = 0; i < 10; i++) { // take input into the array
            arr[i] = sc.nextLine();
        }
        System.out.println("Enter the alaphabet:");
        char c = sc.next().charAt(0); // get the search term from the user
        sc.close();
        for (int i = 0; i < 10; i++) {
            if (arr[i].charAt(0) == c) {  // compare the first letter of each array entry with the search term
                System.out.println(arr[i]);
            }
        }
    }
    
}

/* Output (Run 1):
 * Enter the names: Aman Shahi
Akash Gupta
Suman Mishra
Ram Nath
Govind Kapoor
Shiv singh
Raman singh
Akanksha Banerjee
Akhil Swaraj
Aramesh Kohli
Enter the alaphabet:
A
Aman Shahi
Akash Gupta
Akanksha Banerjee
Akhil Swaraj
Aramesh Kohli

Output (Run 2):
Enter the names: Nikhil Kumar
Ramnath singh
Mithun ray
Ramesh banerjea
Raj bose
Jiya singh
Prithviraj chauhan
Kalyan Gupta
Nikhilesh Anand
Nathan Jones
Enter the alaphabet:
N
Nikhil Kumar
Nikhilesh Anand
Nathan Jones
 */