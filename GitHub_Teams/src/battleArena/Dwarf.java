package battleArena;

public class Dwarf extends Characters {
	
	private boolean drawfClout;

	public Dwarf(String name, int hp, boolean specialAbilityActive) {
		super(name, hp, specialAbilityActive);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isDrawfClout() {
		return drawfClout;
	}

	public void setDrawfClout(boolean drawfClout) {
		this.drawfClout = drawfClout;
	}
	
	@Override
	public void getDamage(int hp) {
		
		
	}

	@Override
	public void attack(Character enemy) {
		// TODO Auto-generated method stub
		
	}
}
