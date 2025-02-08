package Option1;

import java.util.Optional;

public class Main {
	public static void main(String [] args) {
	
		Optional<String> bosNesne = Optional.empty();
		System.out.println(bosNesne.isPresent()); // Optional sınıfında nesne varmı yok mu kontrolü yapar true-false döner
		
		String deger = "Merhaba";
		Optional<String> optional = Optional.of(deger);
		System.out.println(optional.isPresent());
		
		// Optional sınıfına null verilemez fakat bu şekilde yapınca verilir.
		String s = null;
		Optional<String> optional2 = Optional.ofNullable(s);
		System.out.println(optional2.isPresent());
		
		
	}
}
