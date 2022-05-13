/* 7. Write a program by using a class with the following specifications:
Class name — Hcflcm
Data members/instance variables:
int a
int b
Member functions:
Hcflcm(int x, int y) — constructor to initialize a=x and b=y.
void calculate( ) — to find and print hcf and lcm of both the numbers. */

import java.util.Scanner;
public class Hcflcm {
    int a;
    int b;
    Hcflcm(int x, int y) {
        a = x;
        b = y;
    }
    void calculate () {
        int x = a, y = b;
        while (y != 0) { // using long division method to get HCF
            int num = y;
            y = x % y;
            x = num;
        }
        final int HCF = x;
        final int LCM = (a * b) / HCF;
        System.out.println("HCF = " + HCF);
        System.out.println("LCM = " + LCM);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        sc.close();
        Hcflcm ob = new Hcflcm(a, b);
        ob.calculate();
    }
}

/* Output (Run 1):
Enter 1st number : 12
Enter 2nd number : 4
HCF = 4
LCM = 12

Output (Run 2):
Enter 1st number : 60
Enter 2nd number : 40
HCF = 20
LCM = 120
*/