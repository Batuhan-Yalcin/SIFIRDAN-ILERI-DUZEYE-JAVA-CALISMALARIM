package TryCatchV3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] numbers = {0,1,2,3,4};
		Scanner scanner = new Scanner(System.in);
		System.out.print("İndex Değerini Giriniz : ");
		int index = scanner.nextInt();
		try {
			System.out.println(numbers[index]);
		}
		catch (Exception e) {
			System.out.println("Dizide Olmayan İndex değeri girildi ! : " + e.getMessage());
		}
		finally {
			scanner.close();
			
		}
		System.out.println("uygulama sonlandırıldı..");
		
		
	}

}
