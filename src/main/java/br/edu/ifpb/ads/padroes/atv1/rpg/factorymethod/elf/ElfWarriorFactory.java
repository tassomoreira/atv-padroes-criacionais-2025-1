package br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.elf;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.CharacterAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.elf.ElfWarriorAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.CharacterBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.CharacterFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Character;

public class ElfWarriorFactory implements CharacterFactory {

    public Character create(String name) {
        CharacterAbstractFactory factory = new ElfWarriorAbstractFactory();
        return new CharacterBuilder()
                .withName(name)
                .withRace(factory.getRace())
                .withClass(factory.getCharacterClass())
                .withAttributes(factory.getStrength(), factory.getIntelligence(), factory.getAgility(), factory.getHealth(), factory.getMana())
                .withEquipment(factory.createWeapon(), factory.createArmor())
                .withSkills(factory.getSkills())
                .build();
    }
}
