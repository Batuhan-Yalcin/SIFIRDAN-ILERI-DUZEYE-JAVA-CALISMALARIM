package Kısım6;

public class Main {

	public static void main(String[] args) {
		
		String a = "YES";
		String b = "YES";

		// a ve b eşit mi diye kontrol et
		if (a == b)
		    System.out.println(a);
		else
		    System.out.println("Eşit değil");

		// a ve b içerik açısından eşit mi diye kontrol et
		if (a.equals(b))
		    System.out.println(a);
		else
		    System.out.println("Eşit değil");

		
		
		// "Tomato" string'inin ilk 3 karakteri "Tom" ile eşit mi diye kontrol et
		if ("Tomato".substring(0, 4) == "Tom")
		    System.out.println("Tamam");
		else
		    System.out.println("Tomato".substring(0, 4));

	
		
		

	}

}
