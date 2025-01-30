package ClasslarİleArrayListKullanimi;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer(1, "Batuhan", "Yalçın"));
		customers.add(new Customer(2, "Şevval", "Oran"));
		customers.add(new Customer(3, "Hüseyin", "Boğlu"));
		customers.add(new Customer(4, "Şevval", "Yalçın"));
		
		for(Customer customer :customers)
		{
			System.out.println(customer.firstName);
		}

	}

}
