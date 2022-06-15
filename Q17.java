import java.util.Scanner;

/*17. Design a class to overload a function series ( ) as follows :
(i) double series (double n) with one double argument and returns the sum of the series,
sum = 1/1 + 1/2 + 1/3 + .... + 1/n
(ii) double series (double a, double n) with two double arguments and returns the sum of
the series.
sum = 1/a2 + 4/a5 + 7/a8 + 10/a11 + ... + to n
*/

public class Q17 {
    double series(double n) {
        double sum = 0.0;
        for (int i = 1; i < n; i++) {
            sum += 1/n;
        }
        return sum;
    }

    double series (double a, double n) {
        double sum = 0.0, numerator = 1.0, expo = 2.0;
        for (int i = 0; i < n; i++, numerator += 3.0, expo += 3.0) {
            sum += numerator/Math.pow(a, expo);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q17 obj = new Q17();
        int n1, a , n2;
        System.out.print("Enter 1 to show sum of series 1 and enter 2 to show sum of series 2: ");
        int n = sc.nextInt();
        switch(n) {
            case 1:
            System.out.print("Enter n: ");
            n1 = sc.nextInt();
            System.out.println("Sum of series: " + obj.series(n1));
            break;
            
            case 2:
            System.out.print("Enter a: ");
            a = sc.nextInt();
            System.out.print("Enter n: ");
            n2 = sc.nextInt();
            System.out.println("Sum of series: " + obj.series(a, n2));
            break;

            default:
            System.out.print("Invalid choice");
        }

        sc.close();
    }
}

/* Output (Run 1):
Enter 1 to show sum of series 1 and enter 2 to show sum of series 2: 1
Enter n: 10
Sum of series: 0.8999999999999999

Output (Run 2):
Enter 1 to show sum of series 1 and enter 2 to show sum of series 2: 2
Enter a: 1 
Enter n: 4
Sum of series: 22.0
*/