
public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human();
		Human i = new Human();
		Ninja n = new Ninja();
		Wizard w = new Wizard();
		Samurai s = new Samurai();
		Samurai ss = new Samurai();
		h.attack(i);
		System.out.println(h.getHealth());
		System.out.println(i.getHealth());
		n.steal(h);
		System.out.println(h.getHealth());
		System.out.println(n.getHealth());
		s.attack(n);
		n.attack(s);
		s.attack(n);
		n.steal(s);
		s.attack(n);
		w.heal(n);
		s.deathBlow(n);
		n.flee();
		w.fireball(s);
		w.fireball(s);
		ss.deathBlow(s);
		w.fireball(ss);
		ss.deathBlow(w);
		
		
		System.out.println(" There are " + Samurai.howMany() + " Samurai out there... be careful.");
	}

}
