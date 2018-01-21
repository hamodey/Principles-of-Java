package week11;

public abstract class Account {
	protected String id;
	protected double balance;

	public Account(String id, double balance) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.balance = balance;
	}
	
	public String getID() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "ID: " + id + " Balance: " + balance;
	}

    public abstract boolean withdraw(double amount);
    public abstract void deposit(double amount);

}
