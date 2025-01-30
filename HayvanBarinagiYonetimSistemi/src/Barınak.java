import java.util.ArrayList;
import java.util.List;

public class Barınak {
    private List<Hayvan> hayvanListesi = new ArrayList<>();
    private List<Personel> personelListesi = new ArrayList<>();

    public void HayvanEkle(Hayvan hayvan) {
        hayvanListesi.add(hayvan);
        System.out.println(hayvan.getIsim() + " barınağa eklendi.");
    }

    public void PersonelEkle(Personel personel) {
        personelListesi.add(personel);
        System.out.println(personel.getIsim() + " personel olarak eklendi.");
    }

    public void HayvanlariListele() {
        System.out.println("\nBarınaktaki Hayvanlar:");
        for (Hayvan hayvan : hayvanListesi) {
            hayvan.BilgiYazdir();
        }
    }

    public void PersonelleriListele() {
        System.out.println("\nBarınakta Çalışan Personeller:");
        for (Personel personel : personelListesi) {
            personel.BilgiYazdir();
        }
    }
}
