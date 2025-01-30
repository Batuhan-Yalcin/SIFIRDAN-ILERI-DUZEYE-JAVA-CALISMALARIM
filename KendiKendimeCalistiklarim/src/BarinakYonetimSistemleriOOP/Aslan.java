package BarinakYonetimSistemleriOOP;

public class Aslan extends Hayvan {


	public Aslan(String ad,String tur,int yas,double agirlik)
	{
		this.ad = ad;
		this.tur = tur;
		this.yas = yas;
		this.agirlik = agirlik;
	}
	
	public void yemekYemek() {
		System.out.println("Aslan Et Yiyor..");
		
	}


	public void sesCikarmak() {
		System.out.println("Aslan Kükrüyor..");
		
	}

	public String getad()
	{
		return ad;
	}
	
	public void setAd(String ad)
	{
		this.ad = ad;
	}
	
	public String getTur()
	{
		return tur;
	}
	public void setTur(String tur)
	{
	this.tur = tur;	
	}
	
	public int getYas()
	{
		return yas;
	}
	public void setYas(int yas)
	{
		this.yas = yas;
	}
	
	public double getAgirlik()
	{
		return agirlik;
	}
	public void setAgirlik(double agirlik) {
		this.agirlik = agirlik;
	}
	
	public void aslanBilgileri(Hayvan hayvan)
	{
		hayvan.ad = "Aslan";
		hayvan.tur = "Yırtıcı";
		hayvan.yas = 20;
		hayvan.agirlik = 32.30;
	}

}
