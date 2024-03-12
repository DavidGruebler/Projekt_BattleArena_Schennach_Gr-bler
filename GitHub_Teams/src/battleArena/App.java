package battleArena;

public class App {

	public static void main(String[] args) {
		
		BattleCharacter d1 = new Dragon("Drache");
		BattleCharacter dwarf = new Dwarf("Zwerg");
		
		BattleArea a1 = new BattleArea(d1,dwarf);
		
		a1.startFight();
	}

}
