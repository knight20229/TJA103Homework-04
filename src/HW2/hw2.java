package HW2;

public class hw2 {
	public static void main(String[] args) {
		// 第一題 求1~1000 偶數和
		int sum1 = 0;
		for (int i = 1; i <= 1000; i++ ) {
			if (i % 2 == 0) {
				sum1 += i;
			} 
			if (i == 1000) {
				System.out.println("1-1000的偶數和為" + sum1 + "。");
			}
		}
		//第二題 求1*2*3...*10的積 for
		int sum2 = 1;
		for (int i = 2; i <= 10; i++) {
			sum2 *= i;
			if (i == 10) {
				System.out.println("1*2*3...*10的積為" + sum2 + "。(for)");
			}
		}
		// 第三題 求1*2*3...*10的積 while
		int sum3 = 1;
		int i = 1;
		while (i <= 10) {
			i++;
			sum3 *= i;
			if (i == 10) {
				System.out.println("1*2*3...*10的積為" + sum3 + "。(while)");
			}
		}
		// 第四題 設計輸出結果為：1, 4, 9, 16, 25, 36, 49, 64, 81, 100
		// 1~10的平方
		int num = 1;
		for (int i1 = 1; i1 <= 10; i1++) {
		num = (int) Math.pow(i1, 2);
		System.out.print(num +", ");			
		}
	}
}
