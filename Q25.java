/* 25. Design a class to overload a function compared as follows :
(a) void compare(int, int) — to compare two integer values and print the greater of the
two integers.
(b) void compare(char, char) — to compare the numeric value of two characters and
print the character with higher numeric value.
(c) void compare(String, String) — to compare the length of the two strings and print
the longer of the two. */

import java.util.Scanner;
public class Q25 {
    // all the below methods use ternary operators to make the code more concise 
    void compare (int a, int b) {
        int grt = (a > b) ? a : b;
        System.out.println("Larger number is: " + grt);
    }

    void compare (char a, char b) {
        char grt = ((int) a > (int) b) ? a : b; // typecast the char values to int and compare them
        System.out.println("Larger character is: " + grt);
    }

    void compare (String a, String b) {
        String print = (a.length() > b.length()) ? a : b; 
        System.out.println("Longer string is: " + print);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q25 obj = new Q25(); // an object for calling methods
        // the code below will take inputs of characters, integers and Strings
        // and call the corresponding compare() methods
        System.out.print("Enter integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.compare(a, b);
        System.out.print("Enter two characters: ");
        char c = sc.next().charAt(0);
        char d = sc.next().charAt(0);
        obj.compare(c, d);
        System.out.print("Enter two words: ");
        String e = sc.next();
        String f = sc.next();
        sc.close();
        obj.compare(e, f);
    }
}

/*
 * Output (Run 1):
 * Enter integers: 45
 * 109
 * Larger number is: 109
 * Enter two characters: a
 * D
 * Larger character is: a
 * Enter two words: term
 * mansion
 * Longer string is: mansion
 * 
 * Output (Run 2):
 * Enter integers: 209
 * 123
 * Larger number is: 209
 * Enter two characters: L
 * K
 * Larger character is: L
 * Enter two words: escalator
 * none
 * Longer string is: escalator
 */