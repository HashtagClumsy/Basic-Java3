/*Create a class Account with the attributes accountNo – int, accountType – String,
accountBalance – int and methods setAccountDetails() which set the values to these
attributes, withdraw() which subtracts the given amount from the available balance,
deposit() which adds given amount to the available balance and dispAccountDetails()
which displays accountNo, accountType, accountBalance. Create a class Main1 which
contains main() method to test the functionality of Account class.
*/

import java.util.Scanner;

class Account {
	int accountNo;
	String accountType;
	int accountBalance;

	void setAccountDetails(int accountNo, String accountType, int accountBalance) {
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	void withdraw(int withdrawAmount) {

		if (withdrawAmount > accountBalance) {
			System.out.println("Insufficient balance!");
		} else {
			accountBalance = accountBalance - withdrawAmount;
			System.out.println("Withdrawal successful. Remaining balance: " + accountBalance);
		}
	}

	void deposit(int depositAmount) {

		if (depositAmount > 0) {
			accountBalance = accountBalance + depositAmount;
			System.out.println(depositAmount + "$ deposited successfully. New balance: $" + accountBalance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	void dispAccountDetails() {
		System.out.println("Account Number" + accountNo);
		System.out.println("Account Type" + accountType);
		System.out.println("Account Balance" + accountBalance);
		System.out.println("---------------------------");

	}

}

public class Main1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Account a1 = new Account();
		a1.setAccountDetails(12, "Tej", 30000);
		a1.dispAccountDetails();
        System.out.println("Enter deposit amount for account 1 (Tej):");
		int depositAmount = s.nextInt(); // Take user input for deposit amount
		a1.deposit(depositAmount);
        System.out.println("Enter withdraw amount for account 1 (Tej):");	
		int withdrawAmount = s.nextInt();
		a1.withdraw(withdrawAmount);

		Account a2 = new Account();
		a2.setAccountDetails(13, "Ram", 5000);
		a2.dispAccountDetails();
        System.out.println("Enter deposit amount for account 2 (Ram):");
		int depositAmount1 = s.nextInt(); // Take user input for deposit amount
		a2.deposit(depositAmount1);
        System.out.println("Enter withdraw amount for account 2 (Ram):");
		int withdrawAmount1 = s.nextInt();
		a2.withdraw(withdrawAmount1);
		

				s.close();

			}
		

}
