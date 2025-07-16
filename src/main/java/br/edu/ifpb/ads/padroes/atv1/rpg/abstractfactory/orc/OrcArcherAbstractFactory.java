package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.CharacterAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Weapon;

public class OrcArcherAbstractFactory implements CharacterAbstractFactory {

    public String getName() {
        return "Arqueiro Orc";
    }

    public String getRace() {
        return "Orc";
    }

    public String getCharacterClass() {
        return "Arqueiro";
    }

    public int getStrength() {
        return 14;
    }

    public int getIntelligence() {
        return 8;
    }

    public int getAgility() {
        return 12;
    }

    public int getHealth() {
        return 120;
    }

    public int getMana() {
        return 40;
    }
    public Weapon createWeapon() {
        return new Weapon("Arco de Osso", 24, "Arco");
    }

    public Armor createArmor() {
        return new Armor("Couro de Besta", 16, "Média");
    }

    public String[] getSkills() {
        return new String[]{"Tiro Brutal", "Intimidação"};
    }
}