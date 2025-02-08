package Api2;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		
		int [] numaralar = {2,1,6,4,7,5,9};
		Arrays.stream(numaralar)
		.filter((x)-> x > 3) // 3 den büyük olanları getirecek
		.map((x) -> x * 2) // 3'den büyük olanların 2yle çarpılmış hallerini alacak
		.sorted() // sıralanacak 
		.forEach(System.out :: println); // ekrana yazdıracak. 
		
		Stream.of("a","g","d","c")
		.findFirst()
		.ifPresent(System.out::println);
	}

}
