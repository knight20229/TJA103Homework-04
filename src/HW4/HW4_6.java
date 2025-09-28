package HW4;

import java.util.Arrays;

public class HW4_6 {
	public static void main(String[] args) {
		// 二維陣列：計算出每個同學考最高分的次數
		// 陣列複製後，排列新陣列，抓最大值，
		// 找出原陣列每列中對應到的最大值，第幾格則為哪位(i-1)
		// count 1~8號，print每個次數
		int[][] test = {
				{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 99, 75}
				
		};
		int [] count = {0, 0, 0, 0, 0, 0, 0, 0};

		for (int i = 0; i < test.length; i++) {
			int no1 = -1;
			int no1_num = -1;
			
			for(int j = 0; j < test[i].length; j++) {
					if (test[i][j] > no1) {
						no1 = test[i][j];
						no1_num = j;
						
						System.out.println("目前最高分為" + (no1_num + 1) + "號同學的" + no1);	
							if (j < test[i].length - 1) {
								System.out.println("比較" + (j + 1) + "號同學分數" + test[i][j] + "和" + (j + 2) + "號同學分數" + test[i][j + 1]);
							}
					} else {
						System.out.println("目前最高分為" + (no1_num + 1) + "號同學的" + no1);	
						if (j < test[i].length - 1) {
							System.out.println("比較" + (no1_num + 1) + "號同學分數" + no1 + "和" + (j + 2) + "號同學分數" + test[i][j + 1]);
						}
						
					}							
			}
			count[no1_num] += 1;
			System.out.println("第" + (i + 1) + "次小考的最高分為：" + (no1_num + 1) + "號同學的" + no1 + "分。");
			System.out.println("==============================");

			if (i == test.length - 1) {
				System.out.println("全部考試結束！");
				System.out.println("1~8號同學拿最高分的次數分別是：" + Arrays.toString(count));
			} else {
				System.out.println("下一次小考開始！");
			}	
		}					
	}
		
}



