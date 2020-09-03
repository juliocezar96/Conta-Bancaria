package entities;

public class SavingsAccount extends Account {

	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	/*metodo atualizarSaldoConta: atualiza o saldo com a taxa de juros */
	public void updateBalance() {
		balance+= balance * interestRate;
	}
	
	
	
	
}
