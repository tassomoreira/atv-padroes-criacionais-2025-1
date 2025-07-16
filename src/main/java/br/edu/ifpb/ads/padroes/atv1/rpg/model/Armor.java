package br.edu.ifpb.ads.padroes.atv1.rpg.model;

public class Armor implements Cloneable {

    private String name;
    private int defense;
    private String type;

    public Armor(String name, int defense, String type) {
        this.name = name;
        this.defense = defense;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }

    public String getType() {
        return type;
    }

    @Override
    public Armor clone() {
        try {
            return (Armor) super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
