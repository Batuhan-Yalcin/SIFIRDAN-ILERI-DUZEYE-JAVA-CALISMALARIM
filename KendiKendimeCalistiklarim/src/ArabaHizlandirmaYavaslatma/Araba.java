package ArabaHizlandirmaYavaslatma;

public class Araba {
	
	String marka;
	String model;
	int hiz;
	
	public Araba()
	{
		hiz = 0;
	}
	
	public void hizlan()
	{
		hiz += 50;
		marka = "BMW";
		model = "5.25";
		System.out.println(marka +" " + "Markalı" + " "+ model +" " +"Modelli Araç Hızlanıyor"+ " " + "Hızı : " + hiz);
		
	}
	
	public void yavasla()
	{
		hiz -= 25;
		marka = "BMW";
		model = "5.25";
		System.out.println(marka +" " + "Markalı" + " "+ model +" " +"Modelli Araç Yavaşlıyor.."+ " " + "Hızı : " + hiz);
		
	}

}
