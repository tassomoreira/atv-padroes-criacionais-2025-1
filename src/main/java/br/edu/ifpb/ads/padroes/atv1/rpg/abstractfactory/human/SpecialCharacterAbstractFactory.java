package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.human;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.CharacterAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Weapon;

public class SpecialCharacterAbstractFactory implements CharacterAbstractFactory {

    private final String name;

    public SpecialCharacterAbstractFactory(String baseName) {
        this.name = baseName + " o Lendário";
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return "Humano";
    }

    public String getCharacterClass() {
        return "Guerreiro";
    }

    public int getStrength() {
        return 18;
    }

    public int getIntelligence() {
        return 10;
    }

    public int getAgility() {
        return 12;
    }

    public int getHealth() {
        return 140;
    }

    public int getMana() {
        return 40;
    }

    public Weapon createWeapon() {
        return new Weapon("Excalibur", 35, "Espada");
    }

    public Armor createArmor() {
        return new Armor("Armadura do Rei", 30, "Pesada");
    }

    public String[] getSkills() {
        return new String[]{"Investida", "Bloqueio", "Liderança"};
    }
}
