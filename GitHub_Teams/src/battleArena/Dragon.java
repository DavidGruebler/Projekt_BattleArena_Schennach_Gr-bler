package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends BattleCharacter {
	
	int bonus = 10;
	
	public Dragon(String name, int hp, boolean specialAbilityActive) {
		super(name, hp, specialAbilityActive);
	}

	@Override
	public void getDamage(int points) {
		this.hp -= points;
	}
	
	@Override
	public void attack(BattleCharacter enemy) {
		 attackValue = ThreadLocalRandom.current().nextInt(20, 25 +1);
		if(this.isSpecialAbilityActive() == true) {
			int malus = ThreadLocalRandom.current().nextInt(5, 10 +1);
			attackValue -= malus;
		}
		enemy.getDamage(attackValue);
	}

	@Override
	public void activateSpecialAbility() {
		this.setSpecialAbilityActive(true);
		this.setHp(this.getHp()+bonus);
		
	}

	@Override
	public void deactivateSpecialAbility() {
		this.setSpecialAbilityActive(false);
		this.setHp(this.getHp()-bonus);
		
	}
}

