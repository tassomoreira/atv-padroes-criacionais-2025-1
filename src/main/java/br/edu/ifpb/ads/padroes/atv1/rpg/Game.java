package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.elf.ElfArcherFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.human.HumanMageFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.human.SpecialCharacterFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.orc.OrcWarriorFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.model.Character;
import br.edu.ifpb.ads.padroes.atv1.rpg.prototype.CharacterPrototype;

public class Game {

    public static void main(String[] args) {
        Character archer = new ElfArcherFactory().create("Lyanna");
        Character mage = new HumanMageFactory().create("Gorak");
        Character warrior = new OrcWarriorFactory().create("Thrug");
        Character special = new SpecialCharacterFactory("Salomão").create(null);

        CharacterPrototype.register("elfArcher", archer);
        CharacterPrototype.register("humanMage", mage);
        CharacterPrototype.register("orcWarrior", warrior);
        CharacterPrototype.register("special", special);

        Character clone = CharacterPrototype.clone("elfArcher");

        System.out.println(archer);
        System.out.println(mage);
        System.out.println(warrior);
        System.out.println(special);

        System.out.println(clone);
    }
}
