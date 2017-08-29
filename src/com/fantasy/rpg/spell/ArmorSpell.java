/**
 * 
 */
package com.fantasy.rpg.spell;

import com.fantasy.rpg.model.Player;

/**
 * 
 * <p>
 * </p>
 * @author Ritesh Dharmatti
 * 
 */
public class ArmorSpell extends Spell {
	
	private static final int ARMOR= 3;
	
	public ArmorSpell(Player player) {
		this.player = player;
	}

	@Override
	public void doSpell() {
		this.player.addArmor(ARMOR);
	}

}
