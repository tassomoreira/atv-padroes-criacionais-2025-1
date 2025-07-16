package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.*;

public interface CharacterAbstractFactory {

    String getName();
    String getRace();
    String getCharacterClass();
    int getStrength();
    int getIntelligence();
    int getAgility();
    int getHealth();
    int getMana();
    Weapon createWeapon();
    Armor createArmor();
    String[] getSkills();
}
