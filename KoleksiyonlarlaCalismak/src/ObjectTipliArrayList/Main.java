package ObjectTipliArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		// Obje Olarak ArrayList tanımlama Yani içine int String double char herşey eklenebilir..
		
		ArrayList sayilar = new ArrayList();
		sayilar.add(15);
		sayilar.add(20);
		sayilar.add(25);
		sayilar.add("Batuhan");
		sayilar.add('B');
		sayilar.add(10.5);
		sayilar.add(true);
		
		/*
		System.out.println(sayilar.set(0, 100)); // 0. indexteki değeri 100 olarak değiştir.. 15 i 100 yaptı
		System.out.println(sayilar.get(0)); // 2. indexteki objeyi getirir Çıktı = 25;
		System.out.println(sayilar.size()); // sayılar arrayinde kaç eleman olduğunu gösterir çıktı = 7;
		*/
		
		/*
		sayilar.remove(2); // 2. indexteki değeri siler.
		sayilar.clear(); // Listedeki Tüm elemanları siler..
		System.out.println(sayilar.get(2)); // Çıktı normalde 25 olması gerekirdi ama silindiği için çıktı = Batuhan oldu	
		*/
		
		for(Object sayi : sayilar)
		{
			System.out.println(sayi);
		}
		
	
		
	}

}
