
public class BankAccount {
	public double balance;
	public String name;
	public BankAccount(double b, String s){
		balance = b;
		name = s;
	}
	public void deposit(double amount){
		balance += amount;
	}
	public void withdraw(double amount){
		balance -= amount;
	}
}
