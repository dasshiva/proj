/* 3. Write a function fact(int n) to find the factorial of a number n.Include a main class to
find the value of S where:
S = n! / (m!(n - m)!), where, n! = 1 x 2 x 3 x .......... x n */

import java.util.Scanner;
public class Q3 {
    public static int fact (int n) {
        if (n < 0) {
            System.out.println("Factorial of a negative number cannot be calculated ");
            System.exit(0);
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (n) to find factorial : ");
        int n = sc.nextInt();
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        sc.close();
        int S = fact(n) / (fact(m) * fact(n - m));
        System.out.println(S);
    }
}

/* Output (Run 1) :
Enter number (n) to find factorial : 5
Enter m : 3
10

Output (Run 2) :
Enter number (n) to find factorial : 10
Enter m : 5
252
*/