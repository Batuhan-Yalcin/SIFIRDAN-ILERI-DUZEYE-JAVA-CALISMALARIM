import java.sql.Date;

public class Calisan {
	
	private String isim;
	private double maas;
	private Date iseBaslamaTarihi;
	
	public Calisan()
	{
		this("Bilinmiyor",0,null);
	}
	
	public Calisan(String isim)
	{
		this.isim = isim;
	}
	
	public Calisan (String isim, double maas)
	{
		this.isim = isim;
		this.maas = maas;
	}
	
	public Calisan (String isim, double maas, Date iseBaslamaTarihi)
	{
		this.isim = isim;
		this.maas = maas;
		this.iseBaslamaTarihi = iseBaslamaTarihi;
	}
	
	public String getIsim()

	{
		return isim;
	}
	
	public void setIsim(String isim)
	{
		this.isim = isim;
	}
	
	public double maas()
	{
		return maas;
	}
	
	public void setMaas(double maas)
	{
		this.maas = maas;
	}
	
	public Date getİseBaslamaTarihi()
	{
		return iseBaslamaTarihi;
	}
	
	public void setİseBaslamaTarihi(Date iseBaslamaTarihi)
	{
		this.iseBaslamaTarihi = iseBaslamaTarihi;
	}
	
	public void yazdir()
	{
		System.out.print("İsim : " + isim + " " + "Maaş : " + maas + " " + "İşe Başlama tarihi : " + iseBaslamaTarihi);
	}
	
}
