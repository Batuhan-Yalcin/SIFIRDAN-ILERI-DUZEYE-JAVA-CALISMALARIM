package BarinakYonetimSistemleriOOP;

public abstract class Hayvan {
	
	public  String ad;
	public int yas;
	public String tur;
	public double agirlik;
	
	public void yemekYemek() {
	    System.out.println(ad + " yemek yiyor.");
	}

	public abstract void sesCikarmak(); // farklı olacak

	
	

}
