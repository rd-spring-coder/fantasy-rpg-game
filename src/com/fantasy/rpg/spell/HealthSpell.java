package com.fantasy.rpg.spell;

import com.fantasy.rpg.model.Player;

public class HealthSpell extends Spell {

	private static final int HEALTH = 4;
	
	public HealthSpell(Player player) {
		this.player = player;
	}
	
	@Override
	public void doSpell() {
		this.player.addHealth(HEALTH);;
	}

}
