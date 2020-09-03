package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Account acc1 = new Account(1001, "Julio", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		//calculo sem a taxa de 5.0. Feito no SavingsAccount com @Override
		Account acc2 = new SavingsAccount(1002, "Cezar", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
	}

}
