package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.human;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.CharacterAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Weapon;

public class HumanMageAbstractFactory implements CharacterAbstractFactory {

    public String getName() {
        return "Mago Humano";
    }

    public String getRace() {
        return "Humano";
    }

    public String getCharacterClass() {
        return "Mago";
    }

    public int getStrength() {
        return 6;
    }

    public int getIntelligence() {
        return 18;
    }

    public int getAgility() {
        return 8;
    }

    public int getHealth() {
        return 80;
    }

    public int getMana() {
        return 150;
    }

    public Weapon createWeapon() {
        return new Weapon("Cajado Mágico", 15, "Cajado");
    }

    public Armor createArmor() {
        return new Armor("Vestes Mágicas", 8, "Leve");
    }

    public String[] getSkills() {
        return new String[]{"Bola de Fogo", "Cura"};
    }
}
