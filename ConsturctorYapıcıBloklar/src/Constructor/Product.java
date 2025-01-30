package Constructor;

public class Product {

	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	public Product(int id,String name,String description,double price,int stockAmount,String renk,String kod) {
		this.setDescription(description);
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
		this.setStockAmount(stockAmount);
		this.setRenk(renk);
		this.setKod(kod);
	}
	
	public Product()
	{
		
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public String getKod() {
		return kod;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	
	
	
}
