package HWExt_2;


public class ArrowMan extends Hero implements HeroInt {
	
	public ArrowMan() {
		super();
	}

	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
	}
	public void attack() {
		System.out.println(getName() + "射箭攻擊！");
		getEXP(10);

	}
	public void defend() {
		System.out.println(getName() + "閃避攻擊！");
	}
	
	public void move() {
		System.out.println(getName() + "朝敵方移動！");
	}

}
