
public class ParametreliGeriyeDegerDondurmeyenMethodlar {

	public static void main(String[] args) {
		
		
		
		topla(5, 10);
		carp(15, 20, 1);
		adYazdir("Batu", "Ahmet", "Şevval");

	}

	public static void topla(int sayi1 , int sayi2)
	{
		System.out.println("Gönderilen Sayıların Toplamı : " + (sayi1+sayi2));
	}
	
	 public static void carp (int x , int y , int z) // 3 adet sayının çarpımını veren metotu yazalım 
	    {
	        System.out.println("Gönderilen Sayıların Çarpımı : " + (x * y * z)); // x * y * z yaptık 
	    }
	public static void adYazdir(String a, String b ,String c)
	{
		System.out.println("Gönderilen İsimler : " + (a+ " " +b+ " "+c));
	}
}
