package br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Character;

public interface CharacterFactory {
    Character create(String name);
}
