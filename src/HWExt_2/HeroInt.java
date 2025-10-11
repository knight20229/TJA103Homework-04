package HWExt_2;

public interface HeroInt {
	// 可用Default 來預設，但若增加名稱就無法預設
	//	default void move1() {
	//		System.out.println("朝敵方移動！");		//	}
	void move();
	void defend();
	void attack();

}
