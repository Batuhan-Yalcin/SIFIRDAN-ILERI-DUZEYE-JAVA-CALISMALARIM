package first;

public class CiftciKredisi extends BaseKrediHesaplama {
    @Override
    public void KrediCikiyorMu() {
        System.out.println("Krediniz Onaylanmıştır.");
    }

    @Override
    public void TopluKrediHesapla(int miktar) {
        System.out.println("Kredi Geri Ödeme Tutarınız Toplam " + miktar * 1.60 + " TL'dir.");
    }
}
