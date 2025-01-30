public class Film {
    private String filmAdi;
    private int sure; // dakika cinsinden
    private String tur;

    public Film(String filmAdi, int sure, String tur) {
        this.filmAdi = filmAdi;
        this.sure = sure;
        this.tur = tur;
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public int getSure() {
        return sure;
    }

    public String getTur() {
        return tur;
    }

    public void bilgiGoster() {
        System.out.println("Film Adı: " + filmAdi + ", Süre: " + sure + " dakika, Tür: " + tur);
    }
}
