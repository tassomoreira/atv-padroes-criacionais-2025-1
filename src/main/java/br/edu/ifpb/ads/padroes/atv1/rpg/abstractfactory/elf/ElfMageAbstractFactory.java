package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.elf;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.CharacterAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Weapon;

public class ElfMageAbstractFactory implements CharacterAbstractFactory {

    public String getName() {
        return "Mago Élfico";
    }
    public String getRace() {
        return "Elfo";
    }

    public String getCharacterClass() {
        return "Mago";
    }

    public int getStrength() {
        return 4;
    }

    public int getIntelligence() {
        return 20;
    }

    public int getAgility() {
        return 14;
    }

    public int getHealth() {
        return 70;
    }

    public int getMana() {
        return 180;
    }

    public Weapon createWeapon() {
        return new Weapon("Cajado da Natureza", 18, "Cajado");
    }

    public Armor createArmor() {
        return new Armor("Mantos Élficos", 10, "Leve");
    }

    public String[] getSkills() {
        return new String[]{"Magia da Natureza", "Teleporte"};
    }
}
