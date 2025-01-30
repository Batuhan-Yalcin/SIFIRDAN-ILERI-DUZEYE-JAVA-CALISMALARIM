package CarpimTablosu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        
        System.out.println("2. sayıyı giriniz");
        int sayi2 = scanner.nextInt();
        
      
        for (int i = 1; i <= sayi2; i++) {
            int sonuc = sayi * i;
            System.out.println(sayi + " x " + i + " = " + sonuc);
        }
    }
}
