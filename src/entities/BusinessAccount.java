package entities;
//ContaEmpresarial - SUbClasse
public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	/*metodo de emprestimo: só será feito o emprestimo se a quantia que será depositada na conta for menor/igual ao limite
	emprestimo autorizada, pois nao pode ser emprestado um valor acima do limite*/
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
			super.withdraw(amount);
			balance -= 2.0;
		}
	
}
