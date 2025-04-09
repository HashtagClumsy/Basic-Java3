
/*Create a class Account with the attributes accountNo – int, accountType – String,
accountBalance – int and methods setAccountDetails() which set the values to these
attributes, withdraw() which subtracts the given amount from the available balance,
deposit() which adds given amount to the available balance and dispAccountDetails()
which displays accountNo, accountType, accountBalance. Create a class Main1 which
contains main() method to test the functionality of Account class.
*/

import java.util.Scanner;

class AccountOne {
	int accountNo;
	String accountType;
	int accountBalance;

	AccountOne(int accountNo, String accountType, int accountBalance, int depositAmount, int withdrawAmount) {
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		withdraw(withdrawAmount);
		deposit(depositAmount);
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

public class Main1Constructor {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// Taking user input for account 1
		System.out.print("Enter deposit amount for account 1 (Tej): ");
		int depositAmount1 = s.nextInt();
		System.out.print("Enter withdraw amount for account 1 (Tej): ");
		int withdrawAmount1 = s.nextInt();

		// Creating Account 1 with user-specified transactions
		AccountOne a1 = new AccountOne(12, "Tej", 30000, depositAmount1, withdrawAmount1);
		a1.dispAccountDetails();

		// Taking user input for account 2
		System.out.print("Enter deposit amount for account 2 (Ram): ");
		int depositAmount2 = s.nextInt();
		System.out.print("Enter withdraw amount for account 2 (Ram): ");
		int withdrawAmount2 = s.nextInt();

		// Creating Account 2 with user-specified transactions
		AccountOne a2 = new AccountOne(13, "Ram", 5000, depositAmount2, withdrawAmount2);
		a2.dispAccountDetails();

		s.close();
	}

}
