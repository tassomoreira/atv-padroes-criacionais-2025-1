package br.edu.ifpb.ads.padroes.atv1.rpg.singleton;

public class GameConfig {

    private static GameConfig instance;
    private int difficultyLevel;

    private GameConfig() {
        this.difficultyLevel = 1;
    }

    public static GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int level) {
        this.difficultyLevel = level;
    }
}