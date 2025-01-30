package CalisanYonetimSistemiOOP;

public abstract class Calisan {
    private String isim;
    private String depertman;
    private int maas;

    public Calisan(String isim, String depertman, int maas) {
        this.isim = isim;
        this.depertman = depertman;
        this.maas = maas;
    }

    public void zamYap(int zamMiktari) {
        this.maas += zamMiktari;
        System.out.println("Zam Yapıldı" + " " +isim + " isimli çalışanın yeni maaşı: " + this.maas + " TL.");
    }

    public void bilgileriGoster() {
        System.out.println("Çalışan Bilgileri: İsim: " + isim + ", Departman: " + depertman + ", Maaş: " + maas);
    }

    public String getIsim() {
        return isim;
    }
}
