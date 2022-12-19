package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account cliente;
		System.out.println("Enter account number:");
		int number = sc.nextInt();
		System.out.println("Enter account holder:");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println();
		System.out.println("Is there na initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value:");
			double initialDeposite = sc.nextDouble();
			cliente = new Account(number, name, initialDeposite);
		} else {
			cliente = new Account(number, name);
		}

		System.out.println("Account data:\n" + cliente);
		
		System.out.println("Enter a deposit value:");
		double amount = sc.nextDouble();
		cliente.deposit(amount);
		System.out.println("Updated account data:");
		System.out.println("Account data:\n" + cliente);
		
		System.out.println("Enter a withdraw value: ");
		amount = sc.nextDouble();
		cliente.withdraw(amount);
		System.out.println("Updated account data:");
		System.out.println("Account data:\n" + cliente);
		
		
	}

}
