package HW3;
import java.util.Scanner;
public class HW3_1 {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("請輸入第一個整數：");
			int a = sc.nextInt();
			
			System.out.println("請輸入第二個整數：");
			int b = sc.nextInt();
			
			System.out.println("請輸入第二個整數：");
			int c = sc.nextInt();
			// 判斷是否為三角形
			if (a + b > c && a + c > b && b + c > a) {
				if (a == b && b == c) {
					System.out.println("這是正三角形。");
				} else if (a == b || b == c || a == c) {
					System.out.println("這是等腰三角形。");

				} else if (isRight(a, b, c)) {
					System.out.println("這是直角三角形。");
				}
				else {
					System.out.println("這是其他類型的三角形。");
				}
				
			} else {
				System.out.println("這不是三角形喔。");
				}	
		};
				
	}
	// 判定直角三角形與否，兩邊平方和=最大邊平方和
	public static boolean isRight(double a, double b, double c) {
		a = Math.pow(a, 2);
		b = Math.pow(b, 2);
		c = Math.pow(c, 2);
		
		return (a + b == c || a + c == b || b + c == a);
	}
		
		
}
