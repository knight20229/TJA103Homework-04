package HW4;

import java.util.Scanner;

public class HW4_5 {
	public static void main(String[] args) {
		// 輸入三個整數，分別代表西元yyyy年，mm月，dd日
		// 執行後會顯示是該年的第幾天
		// 閏年 = if (yyyy %4 = 0) 366天，2月29日
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		System.out.println("請輸入年份"); // max: 2025
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		// 閏年
		if ( year % 4 == 0) {
			days[1] = 29;
			System.out.println("此年為閏年，2月可輸入至29日。");
		}
		System.out.println("請輸入月份(1~12)");
		int month = sc.nextInt();
		if (month > 0 && month <= 12) {
			for (int i = 0; i < month; i++) {
				sum += days[i];
			}
			int i = month - 1;
			System.out.println("請輸入日期(1~" + days[i] + ")");
			int day = sc.nextInt();	
			while (true) {
				if (day <= days[i]) {
					System.out.println("輸入的日期為該年的第" + sum + "天。");
					break;
				}else {
					System.out.println("輸入的日期錯誤，請遵循陽曆原則。");
					System.out.println("請輸入日期(1~" + days[i] + ")");
					if (sc.hasNextInt()) {
						day = sc.nextInt();						
					};
				}
			}
		}
	}
}
