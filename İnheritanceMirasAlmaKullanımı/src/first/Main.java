package first;

public class Main {

	public static void main(String[] args) {


		Customer customer = new Customer();
		Employer employer = new Employer();
		
		customer.id =1;
		employer.id =2;
		customer.firstName ="Batuhan";
		employer.firstName = "Ahmet";
		
		// Person Class'ını Miras alarak customer ve employee classlarına lazım olan değerleri kullanabildik.
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.Add();
		employeeManager.Add();
		customerManager.List();
		employeeManager.List();
		customerManager.BestCustomer();
		employeeManager.BestEmployee();
		

	}

}
