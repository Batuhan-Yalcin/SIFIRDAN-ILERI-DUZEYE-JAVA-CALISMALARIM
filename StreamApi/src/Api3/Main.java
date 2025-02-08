package Api3;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String []args)
	{
		 IntStream.range(1, 10)
		.forEach(System.out::println);
		 
		Arrays.stream(new int [] {2,6,3,7,4,8})
		.map((x)-> x*2)
		.average() // DİZİNİN ARİTMETİK ORTALAMASINI BULACAK.
		.ifPresent(System.out::println);
		
		int sum = IntStream.range(1, 101)
		.sum(); // 1- 101 arasında sayıların toplamını bulan method
		System.out.println(sum);
		
		Stream.of("1","2","3","4")
		.mapToInt(Integer :: parseInt)
		.max() // Streamdeki sayılardan en büyük olanı bulur
		.ifPresent(System.out::println);
		
		
		IntStream.range(1, 10)
		.mapToObj((i) -> i +"a") // 1- 10 arasındaki sayıları string e çevirdik.
		.forEach(System.out::println);
		
		Stream.of(1.1,2.2,3.3,4.4)
		.mapToInt(Double :: intValue) // double ı int e çeviririr.
		.max() // sayıların maxını bulur 
		.ifPresent(System.out::println);
		
		Stream.of("Ali","Ahmet","Cem","Burak")
		.filter(new Predicate<String>() {
			@Override
			public boolean test(String t)
			{
				System.out.println("Çalıştı");
				return true;
			}
		})
		.forEach(System.out::println);
		
		
		
	}
}
