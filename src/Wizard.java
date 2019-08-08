
public class Wizard extends Human {
	public Wizard() {
		this.setHealth(50);
		this.setIntel(8);
	}
	public void heal(Human target) {
		target.setHealth(target.getHealth()+this.getIntel());
		System.out.println(this + " just healed " + target + " for " + this.getIntel() +" health.");
	}
	public void fireball(Human target) {
		target.setHealth(target.getHealth()-(this.getIntel()*8));
		System.out.println(this + " just shot " + target + " with a FIREBALL! It took "+ this.getIntel()*8 +" health from " + target +".");
	}
}
