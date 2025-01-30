
public class Main {

	public static void main(String[] args) {
			
		/*
		
		BaseLogger [] loggers = new BaseLogger [] { new FileLogger() , new EmailLogger(), new DataBaseLogger(), new ConsoleLogger()};
		
		
				for (BaseLogger logger : loggers)
				{
					logger.Log("Log Mesajı ");
				}
					*/
		
		// Tek bir nesneden İstediğimiz classın mesajını verebiliyoruz. Customer Manager da database i parametre olarak gönderince
		// Buna Tam olarak polymorphizm denir..
		CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
		customerManager.Ekle();
		
		CustomerManager customerManager2 = new CustomerManager(new FileLogger());
		customerManager2.Ekle();
		
		CustomerManager customerManager3 = new CustomerManager(new EmailLogger());
		customerManager3.Ekle();
		
		CustomerManager customerManager4= new CustomerManager(new ConsoleLogger());
		customerManager4.Ekle();
		
	}

}
