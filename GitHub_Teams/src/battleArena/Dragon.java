package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends BattleCharacter {
	
	public Dragon(String name) {
		super(name);
	}

	/**
	 * Reduces the health points of the character by the specified amount of points.
	 * If the health points are less than 0, sets hit points to 0.
	 * @param points The amount of damage.
	 */
	@Override
	public void getDamage(int points) {
		this.hp -= points;
		 if(this.getHp() < 0) {
			 this.setHp(0);
		 }
	}
	
	/*
	 * Attacks the enemy with a random attack value.
	 * If the special ability is active, reduces the attack value by a random malus.
	 * @param enemy The enemy to attack.
	 */
	@Override
	public void attack(BattleCharacter enemy) {
		 attackValue = ThreadLocalRandom.current().nextInt(20, 25 +1);
		if(this.isSpecialAbilityActive() == true) {
			int malus = ThreadLocalRandom.current().nextInt(5, 10 +1);
			attackValue -= malus;
		}
		enemy.getDamage(attackValue);
	}

	/**
	 * Activates the special ability and applies a bonus to the character's hit points.
	 */
	@Override
	public void activateSpecialAbility() {
		this.setSpecialAbilityActive(true);
		this.setHp(this.getHp()+10);	
	}

	/**
	 * Deactivates the special ability and removes the bonus from the character's hit points.
	 */
	@Override
	public void deactivateSpecialAbility() {
		this.setSpecialAbilityActive(false);
		this.setHp(this.getHp()-10);
	}
}