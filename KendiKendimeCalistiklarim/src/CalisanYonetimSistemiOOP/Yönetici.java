package CalisanYonetimSistemiOOP;

public class Yönetici extends Calisan implements IPerformansDegerlendirilebilir {

	   public Yönetici(String isim, String depertman, int maas) {
	        super(isim, depertman, maas);
	    }

	    public void calisma() {
	        System.out.println(getIsim() + " Yöneticisi HomeOffice Çalışıyor");
	    }

	    @Override
	    public void performansDeğerlendir() {
	        System.out.println(getIsim() + " Yönetici performansı: 100/90");
	    }
		
	

}
