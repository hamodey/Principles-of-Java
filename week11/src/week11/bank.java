package week11;
import java.util.ArrayList;


public class bank {
	
    private final ArrayList<Account> accounts;
    
    private double savingsInterestRate;
	
	public bank() {
		// TODO Auto-generated constructor stub
        accounts = new ArrayList<Account>();
	}
	public void setSavingsInterest(double rate) {
        this.savingsInterestRate = rate;
	}
	public int numberOfAccounts() {
		return accounts.size();
	}
	public void addAccount(Account a) {
		accounts.add(a);
	}
	public Account getAccount(String accountID) {
		for(Account account : accounts) {
			if(account.getID().equals(accountID)) {
				return account;
			}
		}
		return null;
	}
	public boolean deposit(String accountID, double amount) {
		Account account = getAccount(accountID);
		if(accountID != null) {
			account.deposit(amount);
			return true;
		}else {
			return false;
		}
	}
	public boolean withdraw(String accountID, double  amount) {
		Account account = getAccount(accountID);
		if(accountID != null) {
			account.withdraw(amount);
			return true;
		}else {
			return false;
		}
	}
	public boolean transfer(String fromAccountID, String toAccountID, double amount) {
		Account fromAccount = getAccount(fromAccountID);
		Account toAccount = getAccount(toAccountID);
		if(fromAccount != null && toAccount != null) {
			if(fromAccount.withdraw(amount)) {
				toAccount.deposit(amount);
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	public void addInterest() {
		for (Account account : accounts) {
			if (account instanceof SavingAccount) {
				SavingAccount savingAccount = (SavingAccount) account;
				savingAccount.addInterest(savingsInterestRate);
				}
			}
		}

	public void reset() {
		for (Account account : accounts) {
			if (account instanceof CheckingAccount) {
				CheckingAccount checkingAccount = (CheckingAccount) account;
				checkingAccount.resetChecksUsed();
	           }
	       }
	   } 
}
