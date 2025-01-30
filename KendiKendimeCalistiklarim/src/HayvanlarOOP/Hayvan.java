package HayvanlarOOP;

public abstract class Hayvan {
	
	protected String ad;
	protected String tur;
	protected int yas;
	
	
	  public Hayvan(String ad, String tur, int yas)
	  {
	        this.ad = ad;
	        this.tur = tur;
	        this.yas = yas;
	    }
	public abstract void sesCikar();
	
	 public void hayvanBilgileriGoster() {
	        System.out.println("Hayvanın Adı: " + ad);
	        System.out.println("Hayvanın Türü: " + tur);
	        System.out.println("Hayvanın Yaşı: " + yas);
	    }
	

}
