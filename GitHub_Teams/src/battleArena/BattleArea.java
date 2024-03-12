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
    public BattleArea(Scanner sc) {
    	this.fighter1 = chooseCharacters(sc);
    	this.fighter2 = chooseCharacters(sc);
    }
    
    /**
     * Starts the battle between the two characters.
     * Picks who goes first at random, then lets them take turns attacking until one character has no health left.
     * Announces the winner at the end.
     */
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

    /**
     * Simulates a single round of combat between two characters.
     * Shows the current player options to attack, use their special ability, or turn it off.
     * Based on the choice, the player can attack the other character, use their special ability, or turn it off.
     * After the action, it checks health to see if someone won.
     * 
     * @param attacker The character who is taking their turn.
     * @param victim The character who is being attacked.
     */
    
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
  
    /**
     * Shows the health and special ability status for both fighters.
     */
    public void printStatusInformations() {
    	  System.out.println("====================================");
    	  System.out.println("         ** Fighter 1 **");
    	  System.out.println("  Name: " + fighter1.getName());
    	  System.out.println("  HP: " + fighter1.getHp());
    	  System.out.println("  Spezialfähigkeit: " + fighter1.isSpecialAbilityActive());
    	  System.out.println("====================================");
    	  System.out.println("         ** Fighter 2 **");
    	  System.out.println("  Name: " + fighter2.getName());
    	  System.out.println("  HP: " + fighter2.getHp());
    	  System.out.println("  Spezialfähigkeit: " + fighter2.isSpecialAbilityActive());
    	  System.out.println("====================================");
    	}
    
    /**
     * Lets the user pick a character to fight with.
     * Shows two options: Dragon or Dwarf.
     * Asks the user for a name for their character.
     * Based on the choice (1 or 2), it creates a new Dragon or Dwarf object and returns it.
     * 
     * @param sc The scanner to get user input.
     * @return The BattleCharacter object representing the chosen character.
     */
    
    public BattleCharacter chooseCharacters(Scanner sc) {
    	
    	System.out.println("=====================");
    	System.out.println("| Character Selection |");
    	System.out.println("=====================");
    	System.out.println("| 1. Dragon  |");
    	System.out.println("| 2. Dwarf   |");
    	System.out.print("Enter the number to choose your character (1 or 2): ");
    	String character = sc.nextLine();
    	System.out.println();
    	System.out.print("Choose a name for your mystic creature: ");
    	String name = sc.nextLine();
    	
    	switch(character) {
    	case "1" : return new Dragon(name);
    	
    	case "2" : return new Dwarf(name);
    	
    	default : return null;
    	}
    
    }
    

}
