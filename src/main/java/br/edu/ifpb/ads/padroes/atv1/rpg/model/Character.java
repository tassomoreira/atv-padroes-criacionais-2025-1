package br.edu.ifpb.ads.padroes.atv1.rpg.model;

public class Character implements Cloneable {

    private String name;
    private String race;
    private String characterClass;
    private int strength;
    private int intelligence;
    private int agility;
    private int health;
    private int mana;
    private Weapon weapon;
    private Armor armor;
    private String[] skills;

    public Character(String name, String race, String characterClass, int strength,
                     int intelligence, int agility, int health, int mana,
                     Weapon weapon, Armor armor, String[] skills) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.health = health;
        this.mana = mana;
        this.weapon = weapon;
        this.armor = armor;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s - %s %s (F:%d, I:%d, A:%d, V:%d, M:%d)",
                name, race, characterClass, strength, intelligence, agility, health, mana);
    }

    @Override
    public Character clone() {
        try {
            Character clone = (Character) super.clone();
            clone.skills = skills.clone();
            clone.weapon = weapon.clone();
            clone.armor = armor.clone();

            return clone;
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
