package four;

public class Main {

	public static void main(String[] args) {
		
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new OracleDatabase(); // Hangi veri tabanı ile çalışmasını istersek onu çağırırız.
		// Bu şekilde hiçbir kodu bozmadan değişmeden istediğimiz kadar class açsak da onun parametresini verdiğimizde
		// onu çağırabileceğiz..
		customerManager.getCustomers();
			
	}

}
