
public class Main {

	public static void main(String[] args) {
		
		try
		{
		int [] sayilar = new int [] {1,2,3};
		System.out.println(sayilar[5]); // TRY'A BU KODLARI ÇALIŞTIRMAYI DENE DİYORUZ..
		}
		catch (StringIndexOutOfBoundsException exception) // KODLARDA HATA VARSA CATCH BLOĞUNA GELİR YANİ BURAYA.
		{	
			System.out.println("Hata Oluştu, Hata sebebi : " +exception);
		}
		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("Hata oluştu, Hata sebebi : " + exception);
		}
		catch (Exception exception) { // Yukarıda ki 2 hata dışında bir hata varsa yazılır
			System.out.println("Loglandı :   " + exception);
		}
		finally { // TRY'DA CATCH DE ÇALIŞSA BU BLOK HERZAMAN ÇALIŞIR..
			System.out.println("BİZ HERTÜRLÜ BURDAYIZ AGAA..");
		}
		
		// Aldığımız Çıktı ; 5. index e sahip değer olmadığı için Hata verdi..
		// Hata Oluştu, Hata sebebi : java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
		// BİZ HERTÜRLÜ BURDAYIZ AGAA..
		
	}
}
