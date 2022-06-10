/* 14. Define a class named Fruit Juice with the following description:
Instance variables / data members :
int product_code - stores the product code number
String flavour - stores the flavour of the juice (E.g. orange, apple, etc.)
String pack_type - stores the type of packaging (E.g. tetra-pack, PET bottle, etc.)
int pack_size - stores package size (E.g. 200 ml, 400 ml, etc.)
int product_price - stores the price of the product 

Member methods :
(i) FruitJuice() - Default constructor to initialize integer data members to 0 and
String data members to ""
(ii) void input( ) - To input and store the product code, flavour, pack type, pack
size and product price.
(iii) void discount( ) - To reduce the product price by 10.
(iv) void display() -  To display the product code, flavour, pack type, pack size
and product price.
*/

import java.util.Scanner;
public class FruitJuice {
	int product_code, pack_size, product_price;
	String flavour, pack_type;
	
	FruitJuice() {
		product_code = 0;
		pack_size = 0;
		product_price = 0;
		flavour = "";
		pack_type = "";
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter flavour: ");
                flavour = sc.nextLine();                  
		System.out.print("Enter packet type: "); 
		pack_type = sc.nextLine();
		System.out.print("Enter product code: ");
		product_code = sc.nextInt();
		System.out.print("Enter packet size: ");
                pack_size = sc.nextInt();
		System.out.print("Enter product price: ");
		product_price = sc.nextInt();
		sc.close();
	}

	void discount() {
		product_price -= 10;
	}

	void display() {
		System.out.println("\nProduct details: ");
		System.out.println("Product code: " + product_code);
		System.out.println("Product size: " + pack_size);
		System.out.println("Product flavour: " + flavour);
		System.out.println("Packet type: " + pack_type);
		System.out.println("Product price: " + product_price);
	}

	public static void main(String[] args) {
		FruitJuice obj = new FruitJuice();
		obj.input();
		obj.discount();
		obj.display();
	}
}

/* Output (Run 1):
 Enter flavour: Mango
 Enter packet type: Large
 Enter product code: 123
 Enter packet size: 400
 Enter product price: 150

 Product details: 
 Product code: 123
 Product size: 400
 Product flavour: Mango
 Packet type: Large
 Product price: 140

 Output (Run 2):
 Enter flavour: Cherry
 Enter packet type: Small
 Enter product code: 3410
 Enter packet size: 100
 Enter product price: 100

 Product details:
 Product code: 3410
 Product size: 100
 Product flavour: Cherry
 Packet type: Small
 Product price: 90
*/
