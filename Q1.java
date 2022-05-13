/* 1.Design a class to overload a function volume( ) as follows:
i. double volume(double r) — with radius (r) as an argument, returns the volume of
sphere using the formula:
V = (4/3) * (22/7) * r * r * r
ii.double volume(double h, double r) — with height(h) and radius(r) as the arguments,
returns the volume of a cylinder using the formula:
V = (22/7) * r * r * h
iii. double volume(double 1, double b, double h) — with length(l), breadth(b) and
height(h)
as the arguments, returns the volume of a cuboid using the formula:
V = l*b*h ⇒ (length * breadth * height) */

import java.util.Scanner;

public class Q1 {
    double volume (double r) {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    double volume (double h, double r) {
        return Math.PI * r * r * h;
    }

    double volume (double l, double b, double h) {
        return l * b * h;
    }

    public static void main(String[] args) {
        Q1 ans = new Q1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");

        // the below code does not create additional variables for storing the
        // results of sc.nextDouble() method. Instead we directly pass the value
        // on to the ans.volume(double r) method
        System.out.println("Volume is : " + ans.volume(sc.nextDouble())); 

        System.out.print("Enter radius and height : ");
        double rad = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Volume is " + ans.volume(rad,height));

        System.out.print("Enter length, breadth and height : ");
        double len = sc.nextDouble();
        double breadth = sc.nextDouble();
        height = sc.nextDouble(); // reusing the same variable to reduce memory usage
        System.out.println("Volume is " + ans.volume(len, breadth , height));
        sc.close();

    }
}

/* Output (Run 1) :
Enter radius 12
Volume is : 5428.672105403162
Enter radius and height :22
34
Volume is 79896.98436609562
Enter length, breadth and height :12 
34
213
Volume is 86904.0

Output (Run 2) :
Enter radius : 23
Volume is : 38223.757816227015
Enter radius and height : 24
55
Volume is 228079.626650619
Enter length, breadth and height : 12
109
14
Volume is 18312.0
*/