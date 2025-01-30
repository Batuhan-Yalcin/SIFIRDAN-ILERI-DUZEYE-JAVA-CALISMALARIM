package EncapsulationGirisGetterVeSetter;



public class Main {

	public static void main(String[] args) {
	
	
	Car car = new Car("Chevrolet", "Camaro", 2024); // Buraya girdiğim değer önemli değil.
	
	car.setYear(2025); // Buraya hangi değeri girersem Çıktı alınca onu verir. Sebebi ise get ve settendir..
	car.SetModel("BMW");
	car.SetMake("5.25");
	
	System.out.println(car.GetYear());
	System.out.println(car.getModel());
	System.out.println(car.getMake());


}
}
