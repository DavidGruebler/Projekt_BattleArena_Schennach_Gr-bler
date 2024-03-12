package battleArena;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//BattleCharacter d1 = new Dragon("Drache");
		//BattleCharacter dwarf = new Dwarf("Zwerg");
		
		BattleArea a1 = new BattleArea(sc);
		
		a1.startFight();
	}

}
