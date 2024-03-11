package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends BattleCharacter {

	int bonus = 10;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Dragon(String name, int hp, boolean specialAbilityActive) {
		super(name, specialAbilityActive);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void getDamage(int points) {
		if(this.getHp()-points <= 0) {
			this.setHp(0);
		this.hp -= points;
		}
	}
	
	@Override
	public void attack(BattleCharacter enemy) {
		int attackValue = ThreadLocalRandom.current().nextInt(20, 25 +1);
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

