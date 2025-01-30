import java.util.ArrayList;
import java.util.List;

public class Salon extends BaseEntity{
    private List<Film> filmler;
    private List<Musteri> musteriler;

    public Salon(int id, String name) {
        super(id, name);
        this.filmler = new ArrayList<>();
        this.musteriler = new ArrayList<>();
    }

    public void filmEkle(Film film) {
        filmler.add(film);
    }

    public void musteriEkle(Musteri musteri) {
        musteriler.add(musteri);
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Salon ID: " + getId() + ", Adı: " + getName());
        System.out.println("Gösterimdeki Filmler:");
        for (Film film : filmler) {
            film.bilgiGoster();
        }
        System.out.println("Kayıtlı Müşteriler:");
        for (Musteri musteri : musteriler) {
            musteri.bilgiGoster();
        }
    }
}
