package HWExt_1;

public class Pencil extends Pen{
	// 繼承pen
	public Pencil(String brand, double price) {
		super(brand, price);
	}
	// 實作抽象方法write()
	@Override
	public void write() {
		System.out.println("書寫方式：削鉛筆後再寫字。可參考加購削鉛筆機。");		
	}
	// 折扣後售價
	@Override
	public double getFinalPrice() {
		return Math.round(getPrice() * 0.8);
	}
	
}
