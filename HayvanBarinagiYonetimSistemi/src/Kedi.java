
public class Kedi extends Hayvan
	{
    public Kedi(String isim, int yas, String saglikDurumu, int barinagaGirisTarihi) {
        super(isim, yas, saglikDurumu, barinagaGirisTarihi);
    }


    public void BilgiYazdir()
    {
        System.out.println("Kedi - İsim: " + getIsim() + ", Yaş: " + getYas() + ", Sağlık: " + getSaglikDurumu() + 
                           ", Barınağa Giriş: " + getBarinagaGirisTarihi());
    }
}

