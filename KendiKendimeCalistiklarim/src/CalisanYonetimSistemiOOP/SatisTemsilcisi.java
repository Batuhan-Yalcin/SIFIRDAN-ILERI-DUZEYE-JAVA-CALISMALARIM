package CalisanYonetimSistemiOOP;

public class SatisTemsilcisi extends Calisan implements IPerformansDegerlendirilebilir {

    public SatisTemsilcisi(String isim, String depertman, int maas) {
        super(isim, depertman, maas);
    }

    public void calisma() {
        System.out.println(getIsim() + " Sahada Müşterileri Gezerek çalışıyor..");
    }

    
    public void performansDeğerlendir() {
        System.out.println(getIsim() + " Satış Temsilcisinin performansı: 100/80");
    }
	
}
