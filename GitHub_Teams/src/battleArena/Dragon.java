package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends BattleCharacter {

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
	public void attack(BattleCharacter enemy) {
		int attackValue = ThreadLocalRandom.current().nextInt(20, 25 +1);
		
		if(fly == true) {
			attackValue -= ThreadLocalRandom.current().nextInt(5, 10 +1);
		 
			
		}
		
	

	public void flyActive(boolean fly, int hp) {
		if(fly == true) {
			hp+=10;
		}
	}
	public void flyDeActive(boolean fly, int hp) {
			if(fly == false) {
				hp-=10;
			}
}
}
