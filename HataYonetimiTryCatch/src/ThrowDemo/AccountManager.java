package ThrowDemo;

public class AccountManager {
	
	private double balance; // para miktarı
	
	public void deposit(double amount) // amount miktar, deposit para yatırmak 
	{
		balance += amount; 
	}
	
	public void Withdraw(double amount)throws BalanceInsufficentException
	{
		if(balance >=amount)
		balance = getBalance()-amount;
		else {
		throw new BalanceInsufficentException ("Bakiye yetersiz");
		}
	}
	
		
	
	public double getBalance()
	{
		return balance;
	}
	

}
