/* 24. Write a program to accept a word and convert it into lowercase if it is in uppercase,
and display the new word by replacing only the vowels with the character following it :
Example :
Sample Input : computer
Sample Output : cpmpvtfr */

import java.util.Scanner;
public class Q24 {
    public static String compute (String n) {
        String s = n.toLowerCase(); // change the string to lower case
        StringBuffer sb = new StringBuffer(s); 
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { // check if the character is a vowel
                sb.deleteCharAt(i); // delete the character at index i to create a space for its replacement
                sb.insert(i, (char) (c + 1)); // insert in its place the character after the vowel
            }
        }
        return sb.toString(); // return the String representation
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String term = sc.next();
        sc.close();
        System.out.println(compute(term));
    }
}

/* Output (Run 1):
 * Enter a word: computer
 * cpmpvtfr
 * 
 * Output (Run 2):
 * Enter a word: scienctific
 * scjfnctjfjc
 */