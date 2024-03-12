package battleArena;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class BattleArea {
	
	 Scanner sc = new Scanner(System.in);
	
    private BattleCharacter fighter1;
    private BattleCharacter fighter2;
    private BattleCharacter winner;
    
    public BattleArea(BattleCharacter fighter1, BattleCharacter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }
    
    public void startFight() {
        int fighterTurn = ThreadLocalRandom.current().nextInt(1, 2 + 1);

        while (fighter1.getHp() > 0 && fighter2.getHp() > 0) {
            if (fighterTurn == 1) {
                simulateCombat(fighter1, fighter2);
                fighterTurn = 2;
            } else {
                simulateCombat(fighter2, fighter1);
                fighterTurn = 1;
            }
        }

        if (winner == fighter1) {
            System.out.println("The winner is: " + fighter1.getName());
        } else {
            System.out.println("The winner is: " + fighter2.getName());
        }
    }

    
    public void simulateCombat(BattleCharacter attacker, BattleCharacter victim) {
    	    	
    	System.out.println("====================================");

    	System.out.println("| " + attacker.getName() + " ist am Zug!                |");

    	System.out.println("====================================");
    	System.out.println("| 1. Attackieren                   |");
    	System.out.println("| 2. Spezialfähigkeit aktivieren   |");
    	System.out.println("| 3. Spezialfähigkeit deaktivieren |");
    	System.out.println("====================================");

    	System.out.println("Wähle deine Aktion (1-3): ");

    	    	
    	int action = sc.nextInt();
        
        switch (action) {
        
        case 1:
        	System.out.println(attacker.getName()+ " hat angegriffen!");
        	attacker.attack(victim);
        	printStatusInformations();
        	break;
        	
        case 2:
        	System.out.println(attacker.getName()+ " hat die Spezialfähigkeit eingesetzt!");
        	attacker.activateSpecialAbility();
        	printStatusInformations();
        	break;
        	
        case 3:
        	System.out.println(attacker.getName()+ " hat die Spezialfähigkeit deaktiviert!");
        	attacker.deactivateSpecialAbility();
        	printStatusInformations();
        	break;
        	
        default:
        	System.out.println("Nur 1. Attack, 2. Activate special ability, 3. Deactivate special ability! ");
        	break;
        }
        if(victim.getHp()<= 0) {
        	winner = attacker;
        }
    	
    }
  
    
    public void printStatusInformations() {
    	  System.out.println("====================================");
    	  System.out.println("         ** Fighter 1 **");
    	  System.out.println("  Name: " + fighter1.getName());
    	  System.out.println("  HP: " + fighter1.getHp());
    	  System.out.println("  Fliegen: " + fighter1.isSpecialAbilityActive());
    	  System.out.println("====================================");
    	  System.out.println("         ** Fighter 2 **");
    	  System.out.println("  Name: " + fighter2.getName());
    	  System.out.println("  HP: " + fighter2.getHp());
    	  System.out.println("  Kopfnuss: " + fighter2.isSpecialAbilityActive());
    	  System.out.println("====================================");
    	}

}
