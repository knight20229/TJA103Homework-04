package HW5;

import java.util.Scanner;

public class HW5_1 {
	// 設計方法starSquare(int width, int height)，輸入寬高可得出相對應的**長方形
	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			System.out.println();
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬度");
		int width = sc.nextInt();
		System.out.println("請輸入高度");
		int height = sc.nextInt();
		starSquare(width, height);
		sc.close();		
	}
	
}
