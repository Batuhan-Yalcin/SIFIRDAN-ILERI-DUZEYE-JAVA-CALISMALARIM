
public abstract class Hayvan {
    private String isim;
    private int yas;
    private String saglikDurumu;
    private int barinagaGirisTarihi;

    public Hayvan(String isim, int yas, String saglikDurumu, int barinagaGirisTarihi) {
        this.isim = isim;
        this.yas = yas;
        this.saglikDurumu = saglikDurumu;
        this.barinagaGirisTarihi = barinagaGirisTarihi;
    }

    public String getIsim() {
        return isim;
    }

    public int getYas() {
    	 return yas;
    }

    public String getSaglikDurumu() {
        return saglikDurumu;
    }

    public void setSaglikDurumu(String saglikDurumu) {
        this.saglikDurumu = saglikDurumu;
    }

    public int getBarinagaGirisTarihi() {
        return barinagaGirisTarihi;
    }

    public abstract void BilgiYazdir();
}
