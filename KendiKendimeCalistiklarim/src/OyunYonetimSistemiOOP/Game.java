package OyunYonetimSistemiOOP;

public class Game {
    private String isim;
    private String tur;
    private int fiyat;

    
    public Game(String isim, String tur, int fiyat) {
        this.isim = isim;
        this.tur = tur;
        this.fiyat = fiyat;
    }

  
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
}
