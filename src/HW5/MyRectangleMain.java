package HW5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle a = new MyRectangle();
		a.setWidth(10);
		a.setDepth(20);
		System.out.println("此長方形的面積為：" + a.getArea());
		MyRectangle b = new MyRectangle(10, 20);
		System.out.println("此長方形的面積為：" + b.getArea());
	}
}
