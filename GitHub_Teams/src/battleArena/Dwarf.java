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
        
    public void activatedrawfClout() {
    	
    }
    
    public void deactivatedrawfClout() {
    	
    }
  
    }
}
