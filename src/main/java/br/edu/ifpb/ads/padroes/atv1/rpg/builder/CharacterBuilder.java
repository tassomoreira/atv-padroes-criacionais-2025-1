package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Character;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Weapon;

public class CharacterBuilder {

    private String name, race, characterClass;
    private int strength, intelligence, agility, health, mana;
    private Weapon weapon;
    private Armor armor;
    private String[] skills;

    public CharacterBuilder withName(String name) {
        this.name = name;

        return this;
    }

    public CharacterBuilder withRace(String race) {
        this.race = race;

        return this;
    }

    public CharacterBuilder withClass(String characterClass) {
        this.characterClass = characterClass;

        return this;
    }

    public CharacterBuilder withAttributes(int strength, int intelligence, int agility, int health, int mana) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.health = health;
        this.mana = mana;

        return this;
    }

    public CharacterBuilder withEquipment(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;

        return this;
    }

    public CharacterBuilder withSkills(String[] skills) {
        this.skills = skills;

        return this;
    }

    public Character build() {
        return new Character(name, race, characterClass, strength, intelligence, agility, health, mana, weapon, armor, skills);
    }
}