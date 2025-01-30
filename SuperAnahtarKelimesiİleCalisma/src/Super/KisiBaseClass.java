package Super;

public class KisiBaseClass {
	
	private String isim;
	
	public KisiBaseClass(String isim)
	{
		this.isim = isim;
	}
	
	public String getIsim()
	{
		return isim;
	}
	public void setIsim(String isim)
	{
		this.isim = isim;
	}
	
	public void bilgileriYazdir()
	{
		System.out.println("Kişi : " + isim);
	}

}
