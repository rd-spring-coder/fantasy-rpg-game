package com.fantasy.rpg.model;

import com.fantasy.rpg.designpattern.Observer;
import com.fantasy.rpg.designpattern.Subject;
import com.fantasy.rpg.factory.SpellsFactory;
import com.fantasy.rpg.spell.ArmorSpell;
import com.fantasy.rpg.spell.DamageSpell;
import com.fantasy.rpg.spell.HealthSpell;

public class Player implements Observer {

	private int armor;
	private int damage;
	private int health;
	
	private String spellName;
	private Subject subject;

	public String getSpellName() {
		return spellName;
	}

	public void setSpellName(String spellName) {
		this.spellName = spellName;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	// Initializing default values
	public Player() {
		this.armor = 0;
		this.damage = 1;
		this.health = 10;
	}

	public void doStuff(String type) {

		switch (type) {

		case "Armor Spell":
			ArmorSpell armorSpell = (ArmorSpell) SpellsFactory.getInstance().requestSpell(this, type);
			armorSpell.doSpell();
			break;
		case "Damage Spell":
			DamageSpell damageSpell = (DamageSpell) SpellsFactory.getInstance().requestSpell(this, type);
			damageSpell.doSpell();
			break;
		case "Health Spell":
			HealthSpell healthSpell = (HealthSpell) SpellsFactory.getInstance().requestSpell(this, type);
			healthSpell.doSpell();
			break;
		}
	}

	public int getArmor() {
		return armor;
	}

	public void addArmor(int armor) {
		this.armor += armor;
	}

	public int getDamage() {
		return damage;
	}

	public void addDamage(int damage) {
		this.damage += damage;
	}

	public int getHealth() {
		return health;
	}

	public void addHealth(int health) {
		this.health += health;
	}

	/* (non-Javadoc)
	 * @see com.fantasy.rpg.designpattern.Observer#update(java.lang.String)
	 */
	@Override
	public void update(String spellName) {
		doStuff(spellName);
	}
}
