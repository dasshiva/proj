/* 33.Special words are those words which starts and ends with the same letter.
Examples:
EXISTENCE
COMIC
WINDOW
Palindrome words are those words which read the same from left to right and
vice versa
Examples:
MALAYALAM
MADAM
LEVEL
ROTATORCIVIC
All palindromes are special words, but all special words are not palindromes.
Write a program to accept a word check and print whether the word is a
palindrome or only special word. */

import java.util.Scanner;
public class Q33 {
    public static boolean isSpecial(String str) {
        char b = str.charAt(0); // get first letter
        int len = str.length(); 
        char e = str.charAt(len - 1); // get last letter
        if (b == e) return true;
        else return false;
    }

    public static boolean isPalindrome (String str) {
        StringBuffer sb = new StringBuffer(str); // create a modifiable copy of the string
        sb.reverse(); // reverse the strored string
        String rev = sb.toString();
        if (str.equals(rev))  // compare the actual string with the reversed string 
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.next();
        sc.close();
        if (isSpecial(input)) {
            if (isPalindrome(input)) 
            System.out.println("Word is palindrome");
            else
            System.out.println("Word is special but not palindrome");
        }
        else
        System.out.println("Word is neither special nor palindrome");
    }
}

/* Output (Run 1):
 * Enter a word: EXISTENCE
 * Word is special but not palindrome
 * 
 * Output (Run 2):
 * Enter a word: MALAYLAM
 * Word is special but not palindrome
 */