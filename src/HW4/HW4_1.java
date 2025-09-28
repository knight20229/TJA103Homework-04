package HW4;
// 第一題：輸出以下陣列所有元素平均值
public class HW4_1 {
	public static void main(String[] args) {
		int[] array1 = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
			sum += array1[i];

		}
		int avg = sum / array1.length;
		System.out.println("此陣列的平均值為：" + avg + "。");
		// 輸出 大於平均值的元素
		System.out.print("其中大於平均值的數字有："); 
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > avg) {
				System.out.print(array1[i] + ","); 
			}
		}
	}
	

}
