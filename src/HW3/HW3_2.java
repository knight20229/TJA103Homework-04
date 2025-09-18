package HW3;

import java.util.Scanner;

public class HW3_2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int answer;
			int i = 0;
			answer = (int)(Math.random() * 10);
			System.out.println("答案是：" + answer);
			System.out.println("請輸入一個整數(0~9)：");
			if (sc.hasNextInt()) {
				i = sc.nextInt();			
			}
			while (true) {
				if (i == answer) {
					System.out.println("恭喜答對！遊戲結束。");
					break;
				} else {
					System.out.println("答錯囉~請繼續猜！");
					System.out.println("請輸入一個整數(0~9)：");
					if (sc.hasNextInt()) {
						i = sc.nextInt();						
					};	
				}
			}
		}			
	}
}
