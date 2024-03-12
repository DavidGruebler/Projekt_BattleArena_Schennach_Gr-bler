package battleArena;

public abstract class BattleCharacter {
	
	private String name;
	protected int hp;
	private boolean specialAbilityActive;
	protected int attackValue;
	
	public BattleCharacter(String name ) {
		this.name = name;
		this.hp = 100;
		this.specialAbilityActive = false;
	}
	
	public  abstract void getDamage(int hp);
	
	public abstract void attack(BattleCharacter enemy);
	
	public abstract void activateSpecialAbility();
	
	public abstract void deactivateSpecialAbility();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public boolean isSpecialAbilityActive() {
		return specialAbilityActive;
	}
	public void setSpecialAbilityActive(boolean specialAbilityActive) {
		this.specialAbilityActive = specialAbilityActive;
	}
	
	public int getAttackValue() {
		return attackValue;
	}

	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}	
}
