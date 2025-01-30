import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class DosyaOkuma {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		int total = 0;	
		try {
 reader = new BufferedReader(new FileReader("C:\\Users\\Emre\\Desktop\\JAVA DERSLERİM 2024\\HataYonetimiTryCatch\\src\\sayilar.txt"));
 String line = null;
 while((line = reader.readLine())!=null) // Bi Satır okuyacak okursa true okuyamazsa false dönecek
 {
	 total += Integer.valueOf(line); // Line ı integer a çevirdik
 }
 System.out.println("Toplam : " + total); // Sayilar.txt yi okuyup İçerisinde ki sayıları topladı 
		} catch (FileNotFoundException e) // Dosya yerinde yoksa hatasıdır.
		{
			e.printStackTrace();
		}
		finally
		{
			reader.close();
		}
		
	}

}
