package HWExt_2;


public class RoleGameTest {

	public static void main(String[] args) {
		SwordMan Aragorn = new SwordMan("亞拉岡", 1, 0);
		ArrowMan Legolas = new ArrowMan("勒苟拉斯", 1, 90);
		SwordMan Boromir = new SwordMan("波羅莫", 1, 0);
		Aragorn.attack();
		Aragorn.move();
		Legolas.attack();
		Boromir.defend();

	}

}
