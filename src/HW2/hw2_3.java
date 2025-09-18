package HW2;

public class hw2_3 {
	public static void main(String[] args) {
		// 設計出輸出結果為以下的程式：
		// A
		// BB
		// CCC
		// ...FFFFFF
		char word = 65;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(word);
			}					
			word++ ;
			System.out.println("");
		}
	}
}
