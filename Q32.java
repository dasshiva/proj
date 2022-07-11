/* 32.Write a program in Java to accept a string in lower case and change the first
letter of every word to upper case. Display the new string.
Sample input: we are in cyber world
Sample output : We Are In Cyber World */

import java.util.Scanner;
public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        input = " " + input; // append a space to detect the first word
        sc.close();
        StringBuffer sb = new StringBuffer(input); // a string buffer to modify the string
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                char c = sb.charAt(i + 1); // first, get the letter to be capitalized
                sb.deleteCharAt(i + 1); // thend delete it from the string
                sb.insert(i + 1, Character.toUpperCase(c)); // then insert its capitalized form at the correct position
            }
        } 
        System.out.println(sb.toString());
    } 
}

/* Output (Run 1):
 * Enter a sentence: we are in cyber world
 * We Are In Cyber World
 * 
 * Output (Run 2):
 * Enter a sentence: run time overhead
 * Run Time Overhead
 */