package HW6;

public class Calculator {
	public double powerXY(int x, int y) throws CalException{
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		}
		if (y < 0) {
			throw new CalException("次方為負值，回傳值不為整數！");
		}
			return Math.pow(x, y);
	}
}