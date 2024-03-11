package battleArena;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class BattleArena {
	
    private BattleCharacter fighter1;
    private BattleCharacter fighter2;
    private BattleCharacter winner;

    public BattleArena(BattleCharacter fighter1, BattleCharacter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }
    
    public void startFight() {
    	int start = ThreadLocalRandom.current().nextInt(1, 2 + 1);
    	if(start ==1) {
    		
    	}
    	
    	
    	
    }
    
    public void simulteCombat(BattleCharacter attacker, BattleCharacter victim, Scanner sc) {
    	
    	System.out.println(attacker.getName() + "ist am Zug");
    	System.out.println("Choose action: 1. Attack, 2. Activate special ability, 3. Deactivate special ability");
    	
    	int action = sc.nextInt();
        
        switch (action) {
        
        case 1:
        	System.out.println(attacker.getName()+ " hat angegriffen!");
        	fighter1.attack(fighter2);
        	break;
        	
        case 2:
        	System.out.println(attacker.getName()+ " hat die Spezialfähigkeit eingesetzt!");
        	fighter1.activateSpecialAbility();
        	break;
        	
        case 3:
        	System.out.println(attacker.getName()+ " hat die Spezialfähigkeit deaktiviert!");
        	fighter1.deactivateSpecialAbility();
        	break;
        	
        default:
        	System.out.println("Nur 1. Attack, 2. Activate special ability, 3. Deactivate special ability! ");
        	break;
        }
    	
    }
    
}
