/* 9. An electronics shop has announced a special discount on the purchase of Laptops as given below:
Category     Discount on Laptop
Up to 25,000       5.0%
25,001 - 50,000    7.5%
50,001 - 1,00,000  10.0%
More than 1,00,000 15.0%
Define a class Laptop described as follows:
Data members/instance variables:
1. name
2. price
3. discount
4. amt
Member Methods:
1. A parameterised constructor to initialize the data members
2. To accept the details (name of the customer and the price)
3. To compute the discount
4. To display the name, discount and amount to be paid after discount.
Write a main method to create an object of the class and call the member methods
*/

import java.util.Scanner;
public class Laptop {
	String name;
	double price, amt, discount;

	Laptop(String name, double price) {
		this.name = name;
		this.price = price;
	}

	void compute() {
		if (price <= 25000)
			discount = 0.05 * price;
		else if (price > 25000 && price <= 50000)
			discount = 0.075 * price;
		else if (price > 50000 && price <= 100000)
			discount = 0.1 * price;
		else
			discount = 0.15 * price;
		amt = price - discount;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Discount: " + discount);
		System.out.println("Amount due: " + amt);
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter price: ");
                double price = sc.nextDouble();
		if (price <= 0) {
			System.out.println("Price cannot be 0 or negative!");
			System.exit(0);
		}
                sc.close();
		Laptop obj = new Laptop(name, price);
		obj.compute();
		obj.display();
	}
}

/* 
 Output (Run 1):
 Enter name: Ram
 Enter price: 45000
 Name: Ram
 Discount: 3375.0
 Amount due: 41625.0 

 Output (Run 2): 
 Enter name: Sam
 Enter price: 145000
 Name: Sam
 Discount: 21750.0
 Amount due: 123250.0
*/
