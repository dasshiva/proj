/* 19. Design a class to overload a function polygon() as follows:-
(i) void polygon(int n, char ch) — with one integer argument and one character type
argument that draws a filled square of side n using the character stored in ch.
(ii) void polygon(int x, int y) — with two integer arguments that draws a filled rectangle
of length x and breadth y, using the symbol ‘@’.
(iii) void polygon( ) — with no argument that draws a filled triangle shown below. */

import java.util.Scanner;
public class Q19 {
    void polygon (int n, char ch) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    void polygon (int x, int y) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++){
                System.out.print('@');
            }
            System.out.println();
        }
    }

    void polygon() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for square, 2 for rectangle, 3 for triangle: ");
        int choice = sc.nextInt();
        Q19 obj = new Q19();
        switch (choice) {
            case 1:
            System.out.print("Enter side length: ");
            int s = sc.nextInt();
            System.out.print("Enter char to be printed: ");
            char ch = sc.next().charAt(0);
            obj.polygon(s, ch);
            break;

            case 2:
            System.out.print("Enter length: ");
            int x = sc.nextInt();
            System.out.print("Enter breadth: ");
            int y = sc.nextInt();
            obj.polygon(x, y);
            break;

            case 3:
            obj.polygon();
            break;

            default:
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}

/* Output (Run 1):
Enter 1 for square, 2 for rectangle, 3 for triangle: 3
*
**
***

Output (Run 2):
Enter 1 for square, 2 for rectangle, 3 for triangle: 1
Enter side length: 3
Enter char to be printed: #
###
###
###
*/