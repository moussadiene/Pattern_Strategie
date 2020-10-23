package sn.game.personnage;

import sn.game.strategy.ComportementArcFleche;
import sn.game.strategy.ComportementHache;
import sn.game.strategy.ComportementPoignard;

public class Troll extends Personnage {


	public Troll() {
		this.arme = new ComportementPoignard();
	}

	@Override
	public void combattre() {
		this.score += 1;
		System.out.println("Je suis un troll ...");
		
		
		if(this.score > 10) {
			this.setArme(new ComportementArcFleche());
		}else {
			if(this.score > 5) {
				this.setArme(new ComportementHache());
			}
		}
		
		this.arme.utilserArme();
		System.out.println("Score = "+this.score);
		
	
	}

}
