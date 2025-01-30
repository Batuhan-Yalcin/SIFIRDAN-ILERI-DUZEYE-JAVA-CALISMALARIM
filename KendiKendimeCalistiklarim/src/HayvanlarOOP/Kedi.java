package HayvanlarOOP;

public class Kedi extends Hayvan {
	
	
	
	public Kedi(String ad,String tur,int yas)
	{
		super(ad, tur, yas);
	}
	
	public void sesCikar()
	{
		System.out.println("Kedi Miyavladı..");
	}
	
	public void hayvanBilgileriGoster()
	{
		System.out.println("Kedinin Adı : " + ad);
		System.out.println("Kedinin Türü : " + tur);
		System.out.println("Kedinin Yaşı : " + yas);
	}

}
