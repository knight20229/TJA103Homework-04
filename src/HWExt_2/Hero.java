package HWExt_2;


public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void getEXP(double amount) {
	    System.out.println(getName() + " 獲得了 " + amount + " 點經驗值！");
		this.exp += amount;
		while (this.exp >= 100) {
			this.level ++;
			this.exp -= 100;
			System.out.println(name + "升級了！等級：" + level);
		}
	    System.out.println("目前經驗值：" + (int)exp + " / 100\n");
	}
	
}
