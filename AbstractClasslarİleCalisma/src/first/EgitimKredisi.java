package first;

public class EgitimKredisi extends BaseKrediHesaplama {

	@Override
	public void KrediCikiyorMu() {
		System.out.println("Kredi Başvurunuz Onaylanmamıştır.");
		
	}

	@Override
	public void TopluKrediHesapla(int miktar) {
		System.out.println("Başvurunuz Onaylanmadığı için Kredi Hesaplaması Yapamazsınız..");
		
	}

}
