/* 12. Using the switch statement, write a menu driven program to calculate the maturity
amount of a Bank Deposit.
The user is given the following options :
(i) Term Deposit
(ii) Recurring Deposit
For option (i) accept principal (P), rate of interest(r) and time period m years(n).
Calculate and output the maturity amount (A) receivable using the formula
For option (ii) accept Monthly Instalment (P), rate of interest (r) and time period in
months (n). Calculate and output the maturity amount (A) receivable using the
formula
For an incorrect option, an appropriate error message should be displayed. */

import java.util.Scanner;
public class Q12 {
	// calculates term deposit
	public double getTD (double principal, float rate, int time) {
		double temp = Math.pow(1 + (rate/100), time);
		return principal * temp;
	}

	// calculates recurring deposit
	public double getRD (double ins, float rate, int n) {
		// here we force floating point division(i.e 1f/12f) 
		// because otherwise integer division would have
		// produced 0 which would have given incorrect results
		double temp = ins * (n * (n + 1))/2 * (rate/100) * (1f/12f);
		return ins * n + temp;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
                System.out.print("Enter 1 to get maturity amount of Term deposit and 2 to get the same for Recurring deposit: ");
                int choice = sc.nextInt();
                double principal, ins;
		float rate;
                int time;
		Q12 obj = new Q12();
                switch (choice) {                                   
			case 1:                                    
				System.out.print("Enter principal: ");
				principal = sc.nextDouble();
				System.out.print("Enter rate: ");
			        rate = sc.nextFloat();
                                System.out.print("Enter time (in years) : ");  
				time = sc.nextInt();
				System.out.println("Maturity amount is: " + obj.getTD(principal, rate, time));
				break;
			case 2:
				System.out.print("Enter monthly installment: ");
				ins = sc.nextDouble();
			        System.out.print("Enter rate: ");
			        rate = sc.nextFloat();
				System.out.print("Enter time (in months): ");
				time = sc.nextInt();
				System.out.println("Maturity amount is: " + obj.getRD(ins, rate, time));
				break;
			default: 
				System.out.println("Invalid choice");
		}
		sc.close();
	}
}

/* Output (Run 1):
 Enter 1 to get maturity amount of Term deposit and 2 to get the same for Recurring deposit: 1
 Enter principal: 12000
 Enter rate: 5
 Enter time (in years) : 2
 Maturity amount is: 13229.998798370389

 Output (Run 2):
 Enter 1 to get maturity amount of Term deposit and 2 to get the same for Recurring deposit: 2
 Enter monthly installment: 1200
 Enter rate: 7
 Enter time (in months): 12
 Maturity amount is: 14946.00001859665
 */
