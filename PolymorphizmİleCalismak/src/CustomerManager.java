
public class CustomerManager {

	private BaseLogger logger;
	
	public CustomerManager (BaseLogger logger)
	{
		this.logger = logger;
	}
	
	public void Ekle ()
	{
		System.out.println("Müşteri Eklendi.");
		this.logger.Log("Log Mesajı Gönderildi");
		
	}
	
}
