package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Account acc = new Account(1001, "Julio", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002,"Cezar", 0.0, 500.0);
		
		/*UPCASTING 
		atribuir um objeto da subclasse para superclass*/
				
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Maria", 0.0, 0.1);
		
		/*DOWNCASTING
		 converter objeto da superclasse para subclass */
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		/* se oque tiver na variavel acc3 de um objeto instancia de BusinessAccount 
		 * poderá fazer o casting e acontecerá uma opereção de emprestimo
		 */
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		/* se oque tiver na variavel acc3 de um objeto instancia de SavingAccount, crio uma variavel
		 * SavingAccount acc5 recebendo o casting de SavingAccount acc3, e acontecerá um update;
		 */
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}

}
