public class Köpek extends Hayvan {
    public Köpek(String isim, int yas, String saglikDurumu, int barinagaGirisTarihi) {
        super(isim, yas, saglikDurumu, barinagaGirisTarihi);
    }

    @Override
    public void BilgiYazdir() {
        System.out.println("Köpek - İsim: " + getIsim() + ", Yaş: " + getYas() + ", Sağlık: " + getSaglikDurumu() + 
                           ", Barınağa Giriş: " + getBarinagaGirisTarihi());
    }
}