package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.human;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.CharacterAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Weapon;

public class HumanArcherAbstractFactory implements CharacterAbstractFactory {

    public String getName() {
        return "Arqueiro Humano";
    }

    public String getRace() {
        return "Humano";
    }

    public String getCharacterClass() {
        return "Arqueiro";
    }

    public int getStrength() {
        return 10;
    }

    public int getIntelligence() {
        return 12;
    }

    public int getAgility() {
        return 16;
    }

    public int getHealth() {
        return 100;
    }

    public int getMana() {
        return 70;
    }

    public Weapon createWeapon() {
        return new Weapon("Arco Élfico", 20, "Arco");
    }

    public Armor createArmor() {
        return new Armor("Armadura de Couro", 12, "Média");
    }

    public String[] getSkills() {
        return new String[]{"Tiro Certeiro", "Chuva de Flechas"};
    }
}