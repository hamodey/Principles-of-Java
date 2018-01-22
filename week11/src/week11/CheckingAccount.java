package week11;

public class CheckingAccount extends Account{
	String id;
	double initialBalance;
	private int numberOfChecksUsed = 0;
	public CheckingAccount(String id, double initialBalance) {
		// TODO Auto-generated constructor stub
		super(id, initialBalance);
		this.id = id;
		this.initialBalance = initialBalance;
		
	}
	public boolean withdraw(double amount) {
		if(initialBalance-amount < 0 || initialBalance < 0) {
			return false;
		}else {
			initialBalance -= amount - 1;
			return true;
		}
	}
	@Override
	public void deposit(double amount) {
		initialBalance += amount;
	}
	public void resetChecksUsed() {
		numberOfChecksUsed = 0;
	}
	public int getChecksUsed() {
		return numberOfChecksUsed;
	}
    public boolean withdrawUsingCheck(double amount) {
        if (numberOfChecksUsed < 3) {
            if (balance - amount >= -10) {
                balance = balance - amount;
                return true;
            } else {
                return false;
            }
        } else {
            if (balance - amount - 2 >= -10) {
                balance = balance - amount - 2;
                return true;
            } else {
                return false;
            }
        }
    }
}
