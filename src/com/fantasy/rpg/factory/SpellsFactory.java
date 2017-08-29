package com.fantasy.rpg.factory;

import java.io.Serializable;

import com.fantasy.rpg.model.Player;
import com.fantasy.rpg.spell.ArmorSpell;
import com.fantasy.rpg.spell.DamageSpell;
import com.fantasy.rpg.spell.HealthSpell;
import com.fantasy.rpg.spell.Spell;

public class SpellsFactory implements Serializable {

	private static final long serialVersionUID = -43180562786293130L;

	private SpellsFactory(){}
	
	private static class SpellsFactoryHelper{
		private static final SpellsFactory instance = new SpellsFactory();
	}
	
	public static SpellsFactory getInstance(){
		return SpellsFactoryHelper.instance;
	}
	
	protected Object readResolve(){
		return getInstance();
	}
	
	public Spell requestSpell(Player p, String type){
		switch(type){
		case "Armor Spell":
				return new ArmorSpell(p);
		case "Damage Spell":
				return new DamageSpell(p);
		case "Health Spell":
				return new HealthSpell(p);
		}
		return null;
	}
}
