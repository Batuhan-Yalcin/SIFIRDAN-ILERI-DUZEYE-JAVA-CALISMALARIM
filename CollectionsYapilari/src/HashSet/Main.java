package HashSet;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		h.add("Batu");
		h.add(58);
		h.add(34);
		h.isEmpty();
		h.remove(34);
		/*
		Iterator itr = h.iterator(); // Hash collectionsında değerlere ulaşmak için kullanılır.
		while(itr.hasNext()) // içerisinde veri varsa
		{
		//	System.out.println(itr.next()); // next methodu ile ekrana çıktı verir
		}
		*/
		// Foreach döngüsünün hash collectionlarında ki kullanışı bu şekildedir.
		// item diye değişken oluşturdum item i yazdırdım ve yine tüm elemanların çıktısı geldi.
		h.forEach(item -> System.out.println(item + " "));
	
	}

}
