package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dwarf extends BattleCharacter {
	
	public Dwarf(String name) {
		super(name);
	}
	
	/**
	 * Reduces the heath points of the character by the specified amount of points(HP can not be negative).
	 * @param points. The amount of damage to be inflicted.
	 */
	@Override
    public void getDamage(int points) {
			this.hp -= points;
			if(this.getHp() < 0) {
				this.setHp(0);
			}
    }
	/**
	 * Attacks the  enemy with a random attack value. If the special ability is active then the damage doubles.
	 * @param enemy. The enemy to attack.
	 */
    @Override
    public void attack(BattleCharacter enemy) {
         attackValue = ThreadLocalRandom.current().nextInt(15, 25 + 1);
         if(this.isSpecialAbilityActive()) {
	        if(this.posibilitySpecialAttack()== true) {
	        	attackValue *= 2;
	        }  else {
	        	attackValue /= 2;
	        }
         }
        enemy.getDamage(attackValue);
        
    }

    /**	
     * Determines the possibility of triggering a special attack based on the current health points.
     * @return true if a special attack is possible, otherwise false.
     */
	public boolean posibilitySpecialAttack() {
		int value = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		
		if((this.getHp() <= 50) && (value <= 3)) {
			return true;
			
		}else if ((this.getHp() <= 20) && (value <= 5)){
			return true;
			
		}else if ((this.getHp() <= 10) && (value <= 7)){
			return true;
			
		}	
		return false;
	}
	
	/**
	 * Activates the special ability if the character's health points are less than 50.
	 */
	@Override
	public void activateSpecialAbility() {
		if(this.posibilitySpecialAttack() == true) {
			this.setSpecialAbilityActive(true);
		}
		
	}
	
	/**
	 * Deactivates the special ability.
	 */
	@Override
	public void deactivateSpecialAbility() {
		this.setSpecialAbilityActive(false);
		
	}
}
