/* 21. Define a class called mobike with the following description:
Instance variables /data members:
String bno — to store the bike’s number for eg(UP65AB1234)
int phno — to store the phone number of the customer
String name — to store the name of the customer
int days — to store the number of days the bike is taken on rent
int charge — to calculate and store the rental charge
Member methods:
void input() — to input and store the detail of the customer.
void compute() — to compute the rental charge.
The rent for a mobike is charged on the following basis:
First five days Rs. 500 per day.
Next five days Rs. 400 per day.
Rest of the days Rs. 200 per day.
void display() — to display the details in the following format: */

import java.util.Scanner;

public class mobike {
	String bno;
	int phno;
	String name;
	int days;
	int charge;

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter bike no:");
		bno = s.nextLine();
		System.out.print("Enter name:");
		name = s.nextLine();
		System.out.print("Enter phone number:");
		phno = s.nextInt();
		System.out.print("Enter number of days:");
		days = s.nextInt();
		s.close();
	}

	void compute() {
		if (days <= 5) 
			charge = days * 500;
		else if (days <= 10 && days > 5)  
			charge = 500 * 5 + (days - 5) * 400;
		else if (days > 10) 
			charge = 2500 + 2000 + (days - 10) * 200;
	}

	void display() {
		System.out.println("Bike No. \t Phone no. \t Name \t No. of days \t Charge \t");
		System.out.println(bno + "\t" + phno + "\t" + name + "\t" + days + "\t" + charge);
	}

	public static void main(String[] args) {
		mobike a = new mobike();
		a.input();
		a.compute();
		a.display();
	}
}

/* Output(Run 1):
Enter bike no:28282
Enter name:Shiva
Enter phone number:102929
Enter number of days:12
Bike No.         Phone no.       Name    No. of days     Charge
28282             102929        Shiva        12           4900

Output(Run 2):
Enter bike no:101020
Enter name:Ram
Enter phone number:919191
Enter number of days:9
Bike No.         Phone no.       Name    No. of days     Charge
101020            919191         Ram         9            4100
*/ 
