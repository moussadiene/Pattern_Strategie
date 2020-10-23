package sn.game.personnage;

import sn.game.strategy.IComportementArme;

public abstract class Personnage {

	protected String nom;
	protected int score;
	
	protected IComportementArme arme;
	
	public abstract	void combattre();

	public void setArme(IComportementArme arme) {
		this.arme = arme;
	}
	
	
}
