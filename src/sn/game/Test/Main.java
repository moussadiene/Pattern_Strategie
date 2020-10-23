package sn.game.Test;

import sn.game.personnage.Personnage;
import sn.game.personnage.Reine;
import sn.game.personnage.Roi;
import sn.game.personnage.Troll;
import sn.game.strategy.ComportementPoignard;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("--------------------------------------");
		Personnage reine = new Reine();
		reine.combattre();

		System.out.println("--------------------------------------");
		Personnage roi = new Roi();
		roi.combattre();
		
		System.out.println("--------------------------------------");
		Personnage troll = new Troll();
		troll.combattre();
		
		System.out.println("-----------------evolition de troll---------------------");

		// evolition de troll
		troll.combattre();
		troll.combattre();
		troll.combattre();
		troll.combattre();
		troll.combattre();
		troll.combattre();

		System.out.println("-----------------le roi change d'arme pour combattre de nouveau---------------------");
		
		
		// change d'arme pour le roi
		roi.setArme(new ComportementPoignard() );
		roi.combattre();
		
		
		
		
	}

}
