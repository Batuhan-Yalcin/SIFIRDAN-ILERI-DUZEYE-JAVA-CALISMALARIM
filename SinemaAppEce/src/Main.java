import java.util.List;

public class Main {
    public static void main(String[] args) {
        KayitSistemi kayitSistemi = new KayitSistemi();

        // XML'den verileri yükle
        List<Film> filmler = SinemaVerisiYukle.filmVerileriniYukle();
        List<Salon> salonlar = SinemaVerisiYukle.salonVerileriniYukle();
        List<Musteri> musteriler = SinemaVerisiYukle.musteriVerileriniYukle();

        // Kayıt işlemleri
        for (Musteri musteri : musteriler) {
            kayitSistemi.kayitOl(musteri);
        }
        for (Salon salon : salonlar) {
            kayitSistemi.kayitOl(salon);
        }

        // Salonlara film ekleme
        salonlar.get(0).filmEkle(filmler.get(0));
        salonlar.get(0).filmEkle(filmler.get(1));

        // Salonlara müşteri ekleme
        salonlar.get(0).musteriEkle(musteriler.get(0));
        salonlar.get(0).musteriEkle(musteriler.get(1));

        // Bilgi Gösterimi
        System.out.println("\n=== Sistem Bilgileri ===");
        kayitSistemi.listele();

        System.out.println("\n=== Salon Detayları ===");
        salonlar.get(0).bilgiGoster();
    }
}
