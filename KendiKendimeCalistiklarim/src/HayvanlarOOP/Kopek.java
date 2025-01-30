package HayvanlarOOP;

public class Kopek extends Hayvan {


	
	public Kopek(String ad,String tur,int yas)
	{
		super(ad, tur, yas);
	}
	
	public void sesCikar()
	{
		System.out.println("Köpek Havladı...");
	}
	
	public void hayvanBilgileriGoster()
	{
		System.out.println("Köpeğin adı : " + ad);
		System.out.println("Köpeğin Cinsi : " + tur);
		System.out.println("Köpeğin Yaşı : " + yas);
	}
	
}
