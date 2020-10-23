package sn.game.personnage;

import sn.game.strategy.ComportementHache;

public class Roi extends Personnage {

	
	public Roi() {
		this.arme = new ComportementHache();
	}

	@Override
	public void combattre() {
		this.score += 2;
		System.out.println("Je suis un roi ...");
		this.arme.utilserArme();
		System.out.println("Score = "+this.score);
	}

}
