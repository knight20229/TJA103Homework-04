package HW5;

public class HW5_5 {
	public static String getAuthCode(int length) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String code = "";
		for (int i = 0; i < length; i++) {
			int index = (int)(Math.random() * chars.length());
			code += chars.charAt(index);
		}
		return code;
	}
	public static void main(String[] args) {
		String code = getAuthCode(8);
		System.out.print("本次隨機產生的驗證碼為：");
		System.out.println(code);
	}
}
