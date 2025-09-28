package HW4;

public class HW4_2 {
	//建立一個字串，執行後結果是相反的
	public static void main(String[] args) {
		String s = "Hello World";
		for (int i = s.length() - 1; i >= 0; i-- ) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		// 第二解法StringBulider.reverse()
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String new_s = sb.toString();
		System.out.println(new_s);
	}

}
