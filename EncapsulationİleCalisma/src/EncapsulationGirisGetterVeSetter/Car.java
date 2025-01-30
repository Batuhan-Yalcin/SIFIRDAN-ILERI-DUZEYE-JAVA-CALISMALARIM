package EncapsulationGirisGetterVeSetter;

public class Car {

	private String make;
	private String model;
	private int year;
	
	
	public Car(String make,String model,int year) {
	this.SetMake(make);
	this.SetModel(model);
	this.setYear(year);
	}
	
	public String getMake() {
		return make;
	}
	public String getModel()
	{
		return model;
	}
	public int GetYear()
	{
		return year;
	}
	
	
	public void SetMake(String make) {
		this.make = make;
	}
	
	public void SetModel(String model)
	{
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}
