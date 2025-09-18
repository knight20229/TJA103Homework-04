package HW3;

import java.util.Scanner;

public class HW3_3 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int i = 0;
			System.out.println("阿文啊...請選你不喜歡哪一個數字吧！");
			if (sc.hasNextInt()) {
				i = sc.nextInt();			
			}
			int count = 0;

			for (int j = 1; j <= 49; j++) {
				if (j % 10 != i ) {
					if (j < i * 10 || j >= i * 10 + 10) {
						System.out.print(j + ", ");
						count++;
						if (count % 6 == 0) {
							System.out.println();
						}
						
					}
						
				}
			}
			System.out.println("共有" + count + "個數字可以選擇。");
			System.out.println();
		}
	}

	

}
