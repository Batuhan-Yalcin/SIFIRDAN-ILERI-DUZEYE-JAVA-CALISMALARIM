package first;

public class AskerKredisi extends BaseKrediHesaplama {

	@Override
	public void KrediCikiyorMu() {
		System.out.println("Krediniz Onaylanmıştır..");
		
	}

	@Override
	public void TopluKrediHesapla(int miktar) {
		System.out.println("Kredi Geri Ödeme Tutarınız : " + miktar * 1.30 + "TL'dir.");
	}
}
