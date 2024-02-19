package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dwarf extends Characters {
	
	private boolean drawfClout;

	public Dwarf(String name, int hp, boolean specialAbilityActive, boolean drawClout) {
		super(name, specialAbilityActive);
		this.drawfClout = drawfClout;
			}
	
	
	public boolean isDrawfClout() {
		return drawfClout;
	}

	public void setDrawfClout(boolean drawfClout) {
		this.drawfClout = drawfClout;
	}
	
	@Override
	public void getDamage(int hp) {
		this.setHp
		
	}

	@Override
	public void attack(Character enemy) {
		int damage = (ThreadLocalRandom.current().nextInt(15, 25 + 1));
		enemy = this.setHp() - damage;
		
	}
}
