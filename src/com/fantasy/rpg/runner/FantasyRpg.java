package com.fantasy.rpg.runner;

import java.util.Scanner;

import com.fantasy.rpg.engine.SpellsEngine;
import com.fantasy.rpg.model.Player;

public class FantasyRpg {

	public static void main(String[] args) {

		SpellsEngine se = new SpellsEngine();

		Player cleric = new Player();
		Player mage = new Player();
		Player warrior = new Player();

		se.registerObserver(cleric);
		se.registerObserver(mage);
		se.registerObserver(warrior);

		char choice = 0;

		do {
			partyStats(cleric, mage, warrior);
			System.out.print("\nCast a Spell\n\n");
			System.out.println("(A)rmor");
			System.out.println("(D)amage");
			System.out.println("(H)ealth");
			System.out.println("(Q)uit");
			System.out.println();

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			choice = sc.next().charAt(0);

			switch (choice) {
			case 'a':
			case 'A':
				se.notifyObservers("Armor Spell");
				break;
			case 'd':
			case 'D':
				se.notifyObservers("Damage Spell");
				break;
			case 'h':
			case 'H':
				se.notifyObservers("Health Spell");
				break;
			}

		} while (choice != 'q' && choice != 'Q');
	}

	/**
	 * @param cleric
	 * @param mage
	 * @param warrior
	 */
	private static void partyStats(Player cleric, Player mage, Player warrior) {

		System.out.println("Party Stats\n");

		// TODO Print a 2d matrix with all player stats
		for (int i = 0; i <= 3; i++) {
			if(i==0){
				System.out.print("\t");
				System.out.print("cleric\t");
				System.out.print("mage\t");
				System.out.print("warrior\t");
				System.out.println();
			}
			else if (i == 1) {
				System.out.print("Armor\t");
				System.out.print(cleric.getArmor() + "\t");
				System.out.print(mage.getArmor() + "\t");
				System.out.print(warrior.getArmor() + "\n");
			} else if (i == 2) {
				System.out.print("Damage\t");
				System.out.print(cleric.getDamage() + "\t");
				System.out.print(mage.getDamage() + "\t");
				System.out.print(warrior.getDamage() + "\n");
			} else if (i == 3) {
				System.out.print("Health\t");
				System.out.print(cleric.getHealth() + "\t");
				System.out.print(mage.getHealth() + "\t");
				System.out.print(warrior.getHealth() + "\n");
			}
		}
	}

}
