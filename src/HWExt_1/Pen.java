package HWExt_1;

public abstract class Pen {
	// 設定屬性
	private String brand;
	private double price;
	private double finalPrice;
	// 建構子 1. 無參數; 2. 有參數 	
	public Pen() {};
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	// Getter, Setter
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brandx) {
		brand = brandx;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double pricey) {
		price = pricey;
	}
	
	// 抽象方法write()，無{}
	public abstract void write(); 
	public abstract double getFinalPrice();

	
}
