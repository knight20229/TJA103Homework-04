package HW4;

import java.util.Scanner;

public class HW4_4 {
	// 設計一個程式，使輸入某個金額後，顯示哪些編號大於金額，
	//印出編號及總人數
	public static void main(String[] args) {
		int xx[][] = {
				{25, 32, 8, 19, 27},
				{2500, 800, 500, 1000, 1200}
				};
		int count = 0;
		System.out.print("阿文想要跟同事借");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("可以借錢的號碼有：");
		for (int i = 0; i < 5; i++) {
			if (n <= xx[1][i]) {
				count++;
				System.out.print(xx[0][i] + ", ");
			} 
		}
		System.out.println("共" + count + "人。");

		 
		 
		 
	}
}
