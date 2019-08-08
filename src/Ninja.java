
public class Ninja extends Human {
	public Ninja() {
		this.setStlth(10);
	}
	public void steal(Human target) {
		target.setHealth(target.getHealth()-this.getStlth());
		this.setHealth(this.getHealth()+this.getStlth());
		System.out.println(this + " just stole " + this.getStlth() + " health from " + target +".");
	}
	public void flee() {
		this.setHealth(this.getHealth()-10);
		System.out.println(this + " just fled!");
	}

}
