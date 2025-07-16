package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.orc;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.CharacterAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Weapon;

public class OrcMageAbstractFactory implements CharacterAbstractFactory {

    public String getName() {
        return "Mago Orc";
    }

    public String getRace() {
        return "Orc";
    }

    public String getCharacterClass() {
        return "Mago";
    }

    public int getStrength() {
        return 10;
    }

    public int getIntelligence() {
        return 14;
    }

    public int getAgility() {
        return 6;
    }

    public int getHealth() {
        return 100;
    }

    public int getMana() {
        return 120;
    }

    public Weapon createWeapon() {
        return new Weapon("Cajado Tribal", 12, "Cajado");
    }

    public Armor createArmor() {
        return new Armor("Vestes Xamânicas", 6, "Leve");
    }

    public String[] getSkills() {
        return new String[]{"Magia Sombria", "Invocação"};
    }
}
