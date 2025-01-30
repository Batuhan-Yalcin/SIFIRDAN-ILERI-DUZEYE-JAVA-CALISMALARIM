package two;

public class DatabaseHelper {
	
	public static class Crud // CREATE READ UPDATE DELETE İŞLEMLERİ..
	{
		public static void Delete()
		{
			System.out.println("Veri Tabanı Silme İşlemi Başladı..");
		}
		public static void Update()
		{
			System.out.println("Veri Tabanı Güncellendi..");
		}
	}
	
	public static class Connection {
	public static void createConnection ()
	{
		System.out.println("Veri Tabanı Bağlantısı Başarılı..");
	}
	}

}
