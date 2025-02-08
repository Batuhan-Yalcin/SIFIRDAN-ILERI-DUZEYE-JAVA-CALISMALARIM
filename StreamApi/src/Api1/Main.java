package Api1;

import java.util.ArrayList;
import java.util.stream.Stream;



public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<String> arrayList = new ArrayList<String>();
		Stream<String> stream = arrayList.stream();
		arrayList.add("İstanbul");
		arrayList.add("Ankara");
		arrayList.add("İzmir");
		arrayList.add("Adana");
		arrayList.add("Bursa");
		
		arrayList.stream()
		.filter((s) -> s.startsWith("İ")) // İ İle başlayanları getiren filtreleme
		.map(String :: toUpperCase)      // dönen değerleri Değiştirdik(Büyük Harfle Yazdırdık yani) haritalama işlemi
		.sorted() 						// sıralama işlemi
		.forEach(System.out::println); // foreach ile ekrana yazma
	}

}
