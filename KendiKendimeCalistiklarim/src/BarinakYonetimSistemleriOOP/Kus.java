package BarinakYonetimSistemleriOOP;

public class Kus extends Hayvan implements IUcanHayvan {


	public void ucusYap() {
		System.out.println("Kuş Uçuyor..");
		
	}

	public void yemekYemek() {
		System.out.println("Kuş Yemek Yiyor..");
		
	}


	public void sesCikarmak() {
		System.out.println("Kuş Ötüyor..");
		
	}
	
	public void kusBilgileri(Hayvan hayvan)
	{
		hayvan.ad = "Maviş";
		hayvan.tur = "Kanarya";
		hayvan.yas = 3;
		hayvan.agirlik = 1.5;
		
	}
	

}
