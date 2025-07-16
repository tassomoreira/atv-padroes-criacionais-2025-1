package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.CharacterAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Weapon;

public class OrcWarriorAbstractFactory implements CharacterAbstractFactory {

    public String getName() {
        return "Guerreiro Orc";
    }

    public String getRace() {
        return "Orc";
    }

    public String getCharacterClass() {
        return "Guerreiro";
    }

    public int getStrength() {
        return 20;
    }

    public int getIntelligence() {
        return 6;
    }

    public int getAgility() {
        return 8;
    }

    public int getHealth() {
        return 150;
    }

    public int getMana() {
        return 20;
    }

    public Weapon createWeapon() {
        return new Weapon("Machado de Guerra", 30, "Machado");
    }

    public Armor createArmor() {
        return new Armor("Armadura Brutal", 25, "Pesada");
    }

    public String[] getSkills() {
        return new String[]{"Fúria", "Pancada Devastadora"};
    }
}
