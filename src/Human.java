
public class Human {
	private int str;
	private int stlth;
	private int intel;
	private int health;
	
	public Human() {
		this.setStr(3);
		this.setStlth(3);
		this.setIntel(3);
		this.setHealth(100);
	}
	
	public void attack(Human target) {
		target.setHealth(target.getHealth()-this.getStr());
	}
	
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getStlth() {
		return stlth;
	}
	public void setStlth(int stlth) {
		this.stlth = stlth;
	}
	public int getIntel() {
		return intel;
	}
	public void setIntel(int intel) {
		this.intel = intel;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
}
