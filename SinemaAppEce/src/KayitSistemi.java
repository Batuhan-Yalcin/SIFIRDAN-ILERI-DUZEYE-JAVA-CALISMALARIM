import java.util.ArrayList;
import java.util.List;

public class KayitSistemi implements IKayit {
    private List<BaseEntity> kayitlar;

    public KayitSistemi() {
        this.kayitlar = new ArrayList<>();
    }

    @Override
    public void kayitOl(BaseEntity entity) {
        kayitlar.add(entity);
        System.out.println(entity.getName() + " sisteme başarıyla kaydedildi!");
    }

    public void listele() {
        for (BaseEntity entity : kayitlar) {
            entity.bilgiGoster();
        }
    }
}
