package HW6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator a = new Calculator();
		Scanner sc = new Scanner(System.in);
		// 輸入x值，不得為數字以外
		int x = 0;
		while (true) {
			System.out.println("請輸入x的值：");
			try {
				x = sc.nextInt();
				break;
			} catch (InputMismatchException e){
				System.out.println("輸入格式不正確，請重新輸入x(整數)");
				sc.next();
			}
		}
		// 輸入y值，不得為數字以外
		int y = 0;
		while (true) {
			System.out.println("請輸入y的值：");
			try {
				y = sc.nextInt();
				break;
			} catch (InputMismatchException e){
				System.out.println("輸入格式不正確，請重新輸入y(整數)");
				sc.next();
			}
		}
		//計算, 例外處理
		try {
			System.out.print(x + "的" + y + "次方為 ");
			System.out.println((int)a.powerXY(x, y));
		} catch (CalException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
	
}
