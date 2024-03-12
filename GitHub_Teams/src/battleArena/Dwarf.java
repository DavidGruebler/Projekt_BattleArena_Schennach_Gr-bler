package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dwarf extends BattleCharacter {
	
	public Dwarf(String name) {
		super(name);

	}

	@Override
    public void getDamage(int points) {
			this.hp -= points;
			if(this.getHp() < 0) {
				this.setHp(0);
			}
    }

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
	
	@Override
	public void activateSpecialAbility() {
		if(this.getHp()<50) {
			this.setSpecialAbilityActive(true);
		}
		
	}

	@Override
	public void deactivateSpecialAbility() {
		this.setSpecialAbilityActive(false);
		
	}
}
