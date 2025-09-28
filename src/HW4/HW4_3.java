package HW4;

public class HW4_3 {
	public static void main(String[] args) {
		// 字串陣列中計算出幾個母音(a, e, i, o, u)
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		for (int i = 0; i < planet.length; i++) {
//			System.out.println(planet[i]);
			for (int j = 0; j < planet[i].length(); j++) {
				char letter = planet[i].charAt(j);
				if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
					count ++;
				}
				
			}
			
		}
		System.out.println("八大行星的母音數量共有：" + count + "個。");
	}

}
