package sn.game.personnage;

import sn.game.strategy.ComportementArcFleche;
import sn.game.strategy.ComportementHache;
import sn.game.strategy.ComportementPoignard;

public class Reine extends Personnage{

	
	public Reine() {
		this.arme = new ComportementArcFleche();
	}

	@Override
	public void combattre() {
		this.score += 4; 
		System.out.println("Je suis une reine ...");
		
		if(this.score > 20) {
			this.setArme(new ComportementPoignard());
		}else {
			if(this.score > 10) {
				this.setArme(new ComportementHache());
			}
		}
		
		this.arme.utilserArme();
		System.out.println("Score = "+this.score);
		
	}

}
