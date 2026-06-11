public class Player {
    private String name;
    private int health;
    private int gold;
    private boolean hasKey;

    public Player(String playerName) {
        name = playerName;
        health = 100;
        gold = 0;
        hasKey = false;
    }
}
