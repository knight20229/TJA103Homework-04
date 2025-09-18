package HW2;

public class hw2_2 {
	public static void main(String[] args) {
		// 第一題：從1~49的數字中，去掉有任何4的數字，共剩多少，共幾個？
		int count = 0;
		System.out.print("可選擇的數字有：");
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != 4) {
				if (i < 40) {
					count++;
					System.out.print(i + ", ");			
				}
			}
		} 					
		System.out.print("共有" + count + "個數字。");
		System.out.println("");
		
		// 第二題：設計出以下：
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9 
		for (int i = 10; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			} 		
			System.out.println("");
		}
	}
}
