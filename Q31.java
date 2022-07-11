/* 31.Write a program to input a sentence and convert it into uppercase and count
and display the total number of words starting with a letter ‘A’.
Example:
Sample Input: ADVANCEMENT AND APPLICATION OF INFORMATION
TECHNOLOGY ARE EVER CHANGING.
Sample Output : Total number of words starting with letter A’ = 4. */

import java.util.Scanner;
public class Q31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = in.nextLine(); // use nextLine() as we need the full line
        in.close();
        int counts = 0;
        int len = input.length();
        input = " " + input.toUpperCase(); // append a space to detect the first word
        for (int i = 0; i < len - 1; i++) {
            // if the current character is a space then, the next letter must be the beginning of a new word
            // so, check if that letter is 'A', if so then increment counter
            if (input.charAt(i) == ' ' && input.charAt(i + 1) == 'A') 
                counts++;
        }
        System.out.println("Number of words starting with 'A' = " + counts);
    }
}

/* Output (Run 1):
 * Enter a sentence: ADVANCEMENT AND APPLICATION OF INFORMATION TECHNOLOGY ARE EVER CHANGING
 * Number of words starting with 'A' = 4
 * 
 * Output (Run 2):
 * Enter a sentence: THIS IS A SENTENCE
 * Number of words starting with 'A' = 1
 */