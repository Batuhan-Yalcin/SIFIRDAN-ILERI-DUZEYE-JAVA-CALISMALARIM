package CalisanYonetimSistemiOOP;

public class Yazilimci extends Calisan implements IPerformansDegerlendirilebilir {

    public Yazilimci(String isim, String depertman, int maas) {
        super(isim, depertman, maas);
    }

    public void calisma() {
        System.out.println(getIsim() + " bilgisayar başında yazılım geliştiriyor.");
    }

    @Override
    public void performansDeğerlendir() {
        System.out.println(getIsim() + " yazılımcının performansı: 100/100");
    }
}
