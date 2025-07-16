package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.human;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.CharacterAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Weapon;

public class HumanWarriorAbstractFactory implements CharacterAbstractFactory {

    public String getName() {
        return "Guerreiro Humano";
    }

    public String getRace() {
        return "Humano";
    }

    public String getCharacterClass() {
        return "Guerreiro";
    }

    public int getStrength() {
        return 15;
    }

    public int getIntelligence() {
        return 8;
    }

    public int getAgility() {
        return 10;
    }

    public int getHealth() {
        return 120;
    }

    public int getMana() {
        return 30;
    }

    public Weapon createWeapon() {
        return new Weapon("Espada de Ferro", 25, "Espada");
    }

    public Armor createArmor() {
        return new Armor("Armadura de Placas", 20, "Pesada");
    }

    public String[] getSkills() {
        return new String[]{"Investida", "Bloqueio"};
    }
}
