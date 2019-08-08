
public class Samurai extends Human {
	private static int numberOf = 0;
	public Samurai() {
		this.setHealth(200);
		numberOf +=1;
	}
	public void deathBlow(Human target) {
		target.setHealth(0);
		this.setHealth(this.getHealth()/2);
		System.out.println(this + " just used DEATHBLOW on " + target + ". " + target +" is now dead.");
	}
	public void meditate() {
		this.setHealth(200);
		System.out.println(this + " just MEDITATED.");
	}
	public static int howMany() {
		return numberOf;
	}
}
