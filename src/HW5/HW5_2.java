package HW5;

public class HW5_2 {
	// 設計方法ranAvg()，取10次0~100的整數，並算出平均值
	public static void ranAvg() {
		System.out.print("本次亂數的結果是：");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int num = (int)(Math.random() * 101);
			System.out.print(num + ", ");
			sum += num;
		}
		int avg = sum / 10;
		System.out.println();
		System.out.println("平均值為：" + avg);
	}
	public static void main(String[] args) {
		ranAvg();
	}
	
}
