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
public class DamageSpell extends Spell {
	
	private static final int DAMAGE = 1;
	
	public DamageSpell(Player player) {
		this.player = player;
	}

	@Override
	public void doSpell() {
		this.player.addDamage(DAMAGE);
	}

}
