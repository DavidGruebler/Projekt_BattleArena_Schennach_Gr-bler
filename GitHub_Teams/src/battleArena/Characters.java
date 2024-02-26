package battleArena;

public abstract class Characters {
	
	private String name;
	protected int hp;
	private boolean specialAbilityActive;
	
	public Characters(String name, boolean specialAbilityActive) {
		super();
		this.name = name;
		this.hp = 100;
		this.specialAbilityActive = specialAbilityActive;
	}
	
	public  abstract void getDamage(int hp);
	
	public abstract void attack(Character enemy);
	
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

	@Override
	public String toString() {
		return "Characters [name=" + name + ", hp=" + hp + ", specialAbilityActive=" + specialAbilityActive + "]";
	}
	
}
