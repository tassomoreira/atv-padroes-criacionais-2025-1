package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.elf;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.CharacterAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Armor;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Weapon;

public class ElfWarriorAbstractFactory implements CharacterAbstractFactory {

    public String getName() {
        return "Guerreiro Élfico";
    }

    public String getRace() {
        return "Elfo";
    }

    public String getCharacterClass() {
        return "Guerreiro";
    }

    public int getStrength() {
        return 12;
    }

    public int getIntelligence() {
        return 14;
    }

    public int getAgility() {
        return 16;
    }

    public int getHealth() {
        return 100;
    }

    public int getMana() {
        return 60;
    }

    public Weapon createWeapon() {
        return new Weapon("Lâmina Élfica", 22, "Espada");
    }

    public Armor createArmor() {
        return new Armor("Cota de Malha Élfica", 15, "Média");
    }

    public String[] getSkills() {
        return new String[]{"Dança das Lâminas", "Agilidade Élfica"};
    }
}
