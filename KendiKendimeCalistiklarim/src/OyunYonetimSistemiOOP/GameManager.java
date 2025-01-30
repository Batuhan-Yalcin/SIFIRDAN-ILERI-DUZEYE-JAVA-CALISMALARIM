package OyunYonetimSistemiOOP;

import java.util.ArrayList;
import java.util.Collections;

public class GameManager {

    private ArrayList<Game> oyunlar = new ArrayList<>();

    // Oyun ekleme metodu
    public void oyunEkle(String isim, String tur, int fiyat) {
        Game game = new Game(isim, tur, fiyat);
        oyunlar.add(game);
    }

    // Oyunları listeleme metodu
    public void oyunListele() {
        int index = 1;
        for (Game game : oyunlar) {
            System.out.println(index + ". Oyun:");
            System.out.println("Oyun İsmi: " + game.getIsim());
            System.out.println("Oyun Türü: " + game.getTur());
            System.out.println("Oyun Fiyatı: " + game.getFiyat() + " TL");
            System.out.println("--------------------");
            index++;
        }
    }

    // Oyun silme metodu
    public void oyunSil(String oyunAdi) {
        for (int i = 0; i < oyunlar.size(); i++) {
            if (oyunlar.get(i).getIsim().equalsIgnoreCase(oyunAdi)) {
                oyunlar.remove(i);
                System.out.println("Oyun silindi: " + oyunAdi);
                return;
            }
        }
        System.out.println("Oyun bulunamadı: " + oyunAdi);
    }

    // Oyunları fiyata göre sıralama metodu
    public void oyunlariFiyataGoreSirala() {
        Collections.sort(oyunlar, (oyun1, oyun2) -> Integer.compare(oyun1.getFiyat(), oyun2.getFiyat()));
        System.out.println("Oyunlar fiyata göre sıralandı:");
        oyunListele();
    }
}
