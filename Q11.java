/* 11. Design a class to overload a function area( ) as follows:
(i) double area (double a, double b, double c) with three double arguments, returns
the area of a scalene triangle using the formula:
area = √s(s-a)(s-b)(s-c) where s=(a+b+c)/2
(ii) double area (int a, int b, int height) with three integer arguments, returns the
area of a trapezium using the formula:
area = 1/2 height (a + b)
(iii) double area (double diagonal 1, double diagonal 2) with two double arguments,
returns the area of a rhombus using the formula :
area = 1/2 (diagonal 1 x diagonal 2)
*/

import java.util.Scanner;
public class Q11 {
	double area (double a, double b, double c) {
		double s = (a + b + c)/2;
		return Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}

	double area (int a, int b, int height) {
		return 0.5 * (a + b) * height;
	}

	double area (double d1, double d2) {
		return 0.5 * d1 * d2;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 to get area of triangle, 2 to get area of trapezium and 3 to get area of rhombus: ");
		int choice = sc.nextInt();
		double s1, s2, s3, d1, d2;
		int a, b, height;
		Q11 obj = new Q11();
		switch (choice) {
			case 1: 
				System.out.print("Enter side 1: ");
				s1 = sc.nextDouble();
				System.out.print("Enter side 2: ");
				s2 = sc.nextDouble();
				System.out.print("Enter side 3: ");
				s3 = sc.nextDouble();
				System.out.println("Area is: " + obj.area(s1,s2,s3));
				break;
			case 2:
				System.out.print("Enter side 1: ");
				a = sc.nextInt();
				System.out.print("Enter side 2: ");
				b = sc.nextInt();
				System.out.print("Enter height: ");
				height = sc.nextInt();
				System.out.println("Area is: " + obj.area(a, b, height));
				break;
			case 3:
				System.out.print("Enter diagonal 1: ");
				d1 = sc.nextDouble();
				System.out.print("Enter diagonal 2: ");
				d2 = sc.nextDouble();
				System.out.println("Area is: " + obj.area(d1, d2));
				break;
			default:
				System.out.println("Invalid choice");
				System.exit(0);
		}
		sc.close();
	}
}

/* 
 Output (Run 1):
 Enter 1 to get area of triangle, 2 to get area of trapezium and 3 to get area of rhombus: 1
 Enter side 1: 20
 Enter side 2: 21
 Enter side 3: 22
 Area is: 190.09060339743257

 Output (Run 2):
 Enter 1 to get area of triangle, 2 to get area of trapezium and 3 to get area of rhombus: 3
 Enter diagonal 1: 32.8
 Enter diagonal 2: 109.34
 Area is: 1793.176
 */
