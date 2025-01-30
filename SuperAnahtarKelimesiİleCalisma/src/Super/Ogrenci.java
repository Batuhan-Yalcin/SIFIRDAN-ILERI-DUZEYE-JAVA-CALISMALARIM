package Super;

public class Ogrenci extends KisiBaseClass {

	private int numara;
	
	public Ogrenci (String isim , int numara)
	{
			super(isim); // Ogrenci Class'ı kişi classının constructor ını yani yapıcı methoddaki değişkenine
			// ulaşabilmesi için kullanırız super ı 
		this.numara = numara;
	}
	
	public int getNumara()
	{
		return numara;
	}
	
	public void setNumara(int numara)
	
	{
		this.numara = numara;
	}
	
	public void ozet()
	{
		System.out.println("Öğrenci Numara : " + numara);
		super.bilgileriYazdir(); // önce ogrencinin numarası daha sonra bilgisi yazılacak 
		// sebebi ise super anahtar kelimesi ile KisiBaseClassından methodu çağırmış olmam
	}
}
