/* 34.Write a program to accept a string. Convert the string to uppercase. Count and
output the number of double letter sequences that exist in the string.
Sample Input: “SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE”
Sample Output: 4 */

import java.util.Scanner;

public class Q34 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = in.nextLine();
        in.close();
        input = input.toUpperCase(); // first, change string to upper case 
        int count = 0;
        int len = input.length(); // get the length of the string for the loop
        
        for (int i = 0; i < len - 1; i++) {
            // now compare the two adjacent characters
            // if they are equal then this is a double letter sequence, so increment count
            if (input.charAt(i) == input.charAt(i + 1))
                count++;
        }
        
        System.out.println("Double Letter Sequence Count = " + count);
        
    }
}

/* Output (Run 1):
 * Enter string: SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE
 * Double Letter Sequence Count = 4
 * 
 * Output (Run 2):
 * Enter string: We are running in the field
 * Double Letter Sequence Count = 1
 */