package battleArena;

public class App {

	public static void main(String[] args) {
		
		BattleCharacter d1 = new Dragon("lyon", 100, false);
		BattleCharacter dwarf = new Dwarf("Johannes",100,false);
		
		BattleArea a1 = new BattleArea(d1,dwarf);
		a1.startFight();
	}

}
