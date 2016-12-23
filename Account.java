package banking;

import java.util.Scanner;

public class Account extends PayeeDetails implements Transaction {
	double balance;
	public double temp;
	public static int PIN = 1111;
	Scanner s = new Scanner(System.in);

	public void deposit() {
		System.out.println("Enter the amount to deposit:");
		temp = s.nextDouble();
		if (temp > 0) {
			balance += temp;
			System.out.println("Rs." + temp + " " + "Successfully Credited");
		} else {
			System.out.println("Minimum Deposit Violation");
		}

	}

	public void withdraw() {
		System.out.println("Enter the amount to be withdrawn :");
		temp = s.nextFloat();
		if (temp <= 0) {
			System.out.println("Invalid Amount Error.");
			System.exit(0);
		}

		else if (temp < balance) {
			balance -= temp;
			System.out.println("Rs." + temp + " " + "Successfully Debited");
		} else {
			System.out.println("Insufficient balance: TRY AGAIN");
		}

	}

	public void balance() {
		System.out.println("Balance amount in your account:" + "Rs." + balance);

	}
}
