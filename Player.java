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

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    public int getGold() {
        return gold;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
