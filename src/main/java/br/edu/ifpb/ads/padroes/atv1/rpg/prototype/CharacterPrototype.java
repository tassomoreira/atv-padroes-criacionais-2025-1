package br.edu.ifpb.ads.padroes.atv1.rpg.prototype;

import br.edu.ifpb.ads.padroes.atv1.rpg.model.Character;

import java.util.HashMap;
import java.util.Map;

public class CharacterPrototype {

    private static final Map<String, Character> prototypes = new HashMap<>();

    public static void register(String key, Character character) {
        prototypes.put(key.toLowerCase(), character);
    }

    public static Character clone(String key) {
        Character original = prototypes.get(key.toLowerCase());

        if (original == null) {
            throw new IllegalArgumentException("Protótipo não encontrado: " + key);
        }

        return original.clone();
    }
}
