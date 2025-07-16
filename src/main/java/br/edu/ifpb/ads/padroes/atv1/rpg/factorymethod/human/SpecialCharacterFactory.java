package br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.human;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.CharacterAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.human.SpecialCharacterAbstractFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.CharacterBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.CharacterFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Character;

public class SpecialCharacterFactory implements CharacterFactory {

    private final String baseName;

    public SpecialCharacterFactory(String baseName) {
        this.baseName = baseName;
    }

    public Character create(String ignored) {
        CharacterAbstractFactory factory = new SpecialCharacterAbstractFactory(baseName);
        return new CharacterBuilder()
                .withName(factory.getName())
                .withRace(factory.getRace())
                .withClass(factory.getCharacterClass())
                .withAttributes(factory.getStrength(), factory.getIntelligence(), factory.getAgility(), factory.getHealth(), factory.getMana())
                .withEquipment(factory.createWeapon(), factory.createArmor())
                .withSkills(factory.getSkills())
                .build();
    }
}
