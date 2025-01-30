package first;

public class Main {

	public static void main(String[] args) {
			/*
			 * Bu yöntemi kullanarak hepsini çağırabiliriz istersek.
			 
		ICustomerDal mysql = new MySqlCustomerDal();
		ICustomerDal oracle = new OracleCustomerDal();
		
		IRepository mysqlUpdate = new MySqlCustomerDal();
		IRepository oracleUpdate = new OracleCustomerDal();

		mysql.add();
		mysqlUpdate.update();
		
		oracle.add();
		oracleUpdate.update();
		
		*/
		
		// yada Bu yöntem ile istediğimiz veri tabanını istediğimiz zaman çağırabiliriz.
		
		// Veri tabanı olarak oracle seçtim hep oracle çalışacak ama yarın MySql e geçmek istedik diyelim
		// OracleCustomerDal ı silip MySqlCustomerDal yazdığımızda Mysql e ekleme yapabiliyoruz..
		CustomerManager customerManager = new CustomerManager();
		customerManager.customerDal = new OracleCustomerDal();
		customerManager.add();
		
		// Yada 3. bir yöntem ile Customer Manager classının constructor ını Çağırıp parametre olarak
		// ICustomerDal customerDal olarak parametre verip this.customerDal = customerDal; diyip parametre ile de getirebilirdik
		
		
	}

}
