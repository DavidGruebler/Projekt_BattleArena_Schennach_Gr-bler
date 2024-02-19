package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Characters {

	private boolean fly;

	public Dragon(String name, int hp, boolean specialAbilityActive) {
		super(name, specialAbilityActive);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDamage(int hp) {
		this.setHp(this.getHp()-hp);
		
	}

	@Override
	public void attack(Character enemy) {
		int attackValue = ThreadLocalRandom.current().nextInt(20, 25 +1);
		
		if(flyActive() == true) {
			attackValue -= ThreadLocalRandom.current().nextInt(5, 10 +1);
		 this.hp += 10;
			
		}
		
	}

	public void flyActive(boolean fly, int hp) {
		
	}
	
	
}
