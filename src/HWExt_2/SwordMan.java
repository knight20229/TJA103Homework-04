package HWExt_2;


public class SwordMan extends Hero implements HeroInt{
	
	public SwordMan() {
		super();
	}
	
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
	}
	public void attack() {
		System.out.println(getName() + "揮舞長劍攻擊！");
		getEXP(10);
	}
	public void move() {
		System.out.println(getName() + "朝敵方移動！");

	}
	public void defend() {
		System.out.println(getName() + "格檔攻擊！");

	}
	

	
}
