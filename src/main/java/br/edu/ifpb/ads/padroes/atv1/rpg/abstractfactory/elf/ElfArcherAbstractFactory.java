package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.elf;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.CharacterAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Weapon;

public class ElfArcherAbstractFactory implements CharacterAbstractFactory {

    public String getName() {
        return "Arqueiro Élfico";
    }

    public String getRace() {
        return "Elfo";
    }

    public String getCharacterClass() {
        return "Arqueiro";
    }

    public int getStrength() {
        return 8;
    }

    public int getIntelligence() {
        return 16;
    }

    public int getAgility() {
        return 20;
    }

    public int getHealth() {
        return 90;
    }

    public int getMana() {
        return 100;
    }

    public Weapon createWeapon() {
        return new Weapon("Arco Longo Élfico", 28, "Arco");
    }

    public Armor createArmor() {
        return new Armor("Armadura de Couro Élfico", 14, "Média");
    }

    public String[] getSkills() {
        return new String[]{"Tiro Múltiplo", "Camuflagem"};
    }
}
