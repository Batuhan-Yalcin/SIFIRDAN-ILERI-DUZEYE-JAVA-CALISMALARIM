package ThrowDemo;

public class Main {

	public static void main(String[] args) {
		AccountManager manager = new AccountManager();
		
		manager.deposit(100); // hesaba 100 tl para aktardım.
		System.out.println("Hesap : " + manager.getBalance());
		
		
		
		try {
			manager.Withdraw(90); // hesaptan 90 tl para çektim.
		}
		catch (BalanceInsufficentException exception) {
		System.out.println(exception.getMessage()); 
		}
		System.out.println("Hesap : " + manager.getBalance());
		try {
			manager.Withdraw(20); // 20 daha çekmeye çalıştım. 
		}
		catch (BalanceInsufficentException exception) {
			System.out.println(exception.getMessage()); 
		}		
		System.out.println("Hesap : " + manager.getBalance());
	}

}
