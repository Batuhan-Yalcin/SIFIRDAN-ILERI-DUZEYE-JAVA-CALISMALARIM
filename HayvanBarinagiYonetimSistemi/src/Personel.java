public class Personel {
    private String isim;
    private String gorev;
    private int yas;

    public Personel(String isim, String gorev, int yas) {
        this.isim = isim;
        this.gorev = gorev;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public String getGorev() {
        return gorev;
    }

    public int getYas() {
        return yas;
    }

    public void BilgiYazdir() {
        System.out.println("Personel - İsim: " + isim + ", Görev: " + gorev + ", Yaş: " + yas);
    }
}