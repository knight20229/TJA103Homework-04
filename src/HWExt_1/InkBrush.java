package HWExt_1;

public class InkBrush extends Pen{
	// 繼承Pen
	public InkBrush(String brand, double price) {
		super(brand, price);
	}
	// 實作抽象方法write()
	@Override
	public void write() {
		System.out.println("書寫方式：沾好墨汁後再寫字。可參考加購墨水。");
	}
	// 折扣後的售價
	@Override
	public double getFinalPrice() {
		return Math.round(getPrice() * 0.9);
	}

	
}
