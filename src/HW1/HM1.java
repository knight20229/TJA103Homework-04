package HW1;

public class HM1 {
	public static void main(String[] args) {
		// 第一題：計算12和6的和與積
		int a = 12;
		int b = 6;
		System.out.println((a + b) + "、" + (a * b));

		// 第二題：計算200顆雞蛋為幾打幾顆
		int eggs = 200;
		int dozen = 12;
		System.out.println(eggs + "個雞蛋共是" + eggs / dozen + "打" + eggs % dozen + "顆。" );
		
		//第三題：算出256559秒為幾天、幾小時、幾分、幾秒
		int sec1 = 256559;
		int sec2 = sec1 % 60;
		int min1 = sec1 / 60;
		int min2 = min1 % 60;
		int hour1 = min1 / 60;
		int hour2 = hour1 % 24;
		int day = hour1 / 24;
		System.out.println(sec1 + "秒為" + day + "天" + hour2 + "小時" + min2 + "分" + sec2 + "秒。");
		
		// 第四題：定義一個常數3.1415(圓周率)，並計算半徑為5的圓面積及圓周長
		final double PI = 3.1415;
		int r = 5;
		double area = Math.pow(r, 2) * PI;
		double C = 2 * r * PI;
		System.out.printf("半徑為5的圓的面積為%.4f", area); 
		System.out.printf("，圓周長為%.4f%n", C);
		
		// 第五題：某人在銀行存入150萬，利率為2%，若每年利息都繼續存在銀行，
		// 計算10年後本金加利息有多少錢(用複利計算)
		// FV(本利和) = PV(本金) * (1 + r(利率)^n(年數))
		int pv = 1500000;
		double r2 = 0.02;
		double fv = pv * Math.pow((1 + r2), 10);
		System.out.printf("本利和為%.2f", fv);
		System.out.println("元。");
		
		// 第六題：寫一隻程式，用System.out.println()印出三個運算結果：
		// 5 + 5
		// 5 + '5'
		// 5 + "5"
		// 並各自說明答案的原因
		System.out.println(5 + 5); // = 10，兩者皆為數字相加，故答案為10
		System.out.println(5 + '5'); // = 58，前者為數字5，後者單引號內為字元 char 5 = U +0035(十六進制)
									 //	換算十進制＝53，故=58
		System.out.println(5 + "5"); // = 55，後者雙引號內為String，故合併為文字串接

	}
}
