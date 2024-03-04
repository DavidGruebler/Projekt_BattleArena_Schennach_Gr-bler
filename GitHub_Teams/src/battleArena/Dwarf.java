package battleArena;

import java.util.concurrent.ThreadLocalRandom;

public class Dwarf extends BattleCharacter {
	
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
    public void getDamage(int points) {
        this.hp -= points;
    }

    @Override
    public void attack(BattleCharacter enemy) {
        int attackValue = ThreadLocalRandom.current().nextInt(15, 25 + 1);
        enemy.getDamage(attackValue);
    }


	public boolean posibilitySpecialAttack() {
		int value = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		
		if((this.getHp() < 50) && (value <= 3)) {
			return true;
			
		}else if ((this.getHp() < 20) && (value <= 5)){
			return true;
			
		}else if ((this.getHp() < 10) && (value <= 7)){
			return true;
			
		}
		return false;
	}
	
	@Override
	public void activateSpecialAbility() {
		if(this.getHp()<50) {
			this.setSpecialAbilityActive(false);
		}
		
	}

	@Override
	public void deactivateSpecialAbility() {
		this.setSpecialAbilityActive(false);
		
	}
}
