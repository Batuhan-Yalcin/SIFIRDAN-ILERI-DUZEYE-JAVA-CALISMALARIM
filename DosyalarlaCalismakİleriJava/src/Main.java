import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
	//	getFileİnfo();
		
		readFile();
		writeFile();
		readFile();
		
		
		
		
		
	}

		public static void createFile()
		{
			File file = new File("C:\\Users\\Emre\\Desktop\\JAVA DERSLERİM 2024\\Files\\students.txt");
			try {
				if(file.createNewFile())
				{
					System.out.println("Dosya Oluşturuldu..");
				}
				else {
					System.out.println("Dosya zaten mevcut.");
				}
			} catch (Exception e) {
				
			}
		}
	
		public static void getFileİnfo() { 
			File file = new File("C:\\Users\\Emre\\Desktop\\JAVA DERSLERİM 2024\\Files\\students.txt"); 
			if(file.exists()) // exists methodu --> böyle bir dosya varsa true döndürür yoksa false
			{
			// yani şunu yaptık böyle bir dosya var ise 
	System.out.println("Dosya adı : " +file.getName()); // İsmini okumak için getName methodu
	System.out.println("Dosyanın Yolu : " + file.getAbsolutePath()); // Dosyanın yolunu gösteren method
	System.out.println("Dosya Yazılabilir mi : " + file.canWrite()); // Dosyanın İçerisine yazı yazılabilir mi 
	// Bazı dosyalara Yazı yazma yetkisi kaldırıldığı için Programcıya lazım oluyor..
	System.out.println("Dosya Okunabilir mi : " + file.canRead()); // Dosya Okunabilir mi ? yetki varmı gibi..
	System.out.println("Dosya boyutu (Byte olarak verir) : " +file.length() );
			}
		}
		
		public static void readFile()
		{
			File file = new File("C:\\Users\\Emre\\Desktop\\JAVA DERSLERİM 2024\\Files\\students.txt");
			try {
				Scanner reader = new Scanner(file);
				while(reader.hasNextLine()) // Okunacak satır varsa yapacağı işlem 
				{
					String line = reader.nextLine(); //Okunacak satır varsa okuyor.
					System.out.println(line);
				}
				reader.close(); // Okuma işlemi bittiğinde okuma işlemini kapatıyoruz.
			} catch (FileNotFoundException e) {
				 	
			}
		}
		
		public static void writeFile() {
			try {
				// BufferedWriter classına parametre olarak FileWriter ı verdik sebebi ise : 
				// Dosyaya yazma işlemleri için ikisini bir kullanıyoruz.
				
				BufferedWriter writer = new BufferedWriter(new FileWriter
				("C:\\Users\\Emre\\Desktop\\JAVA DERSLERİM 2024\\Files\\students.txt",true));
				writer.newLine(); // Yeni satır oluştur altına yaz anlamında..
				writer.write("Şevval"); // Dosyaya şevval yaz.
				System.out.println("Dosyaya Yazıldı..");
				writer.close();
			} catch (IOException e) {
				
			}
		}
}
