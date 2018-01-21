package week11;

public class SavingAccount extends Account{
	String id;
	double initialDeposit;
	public SavingAccount(String id, double initialDeposit) {
		// TODO Auto-generated constructor stub
		super(id, initialDeposit);
		this.id = id;
		this.initialDeposit = initialDeposit;
		
	}
	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance-amount-3 >= 10) {
			balance = balance - amount - 3;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance = balance + amount;
	}
	public double addInrest(double rate) {
        double interest = balance * (rate / 100);
        balance = balance + interest;
        return interest;
	}

}
