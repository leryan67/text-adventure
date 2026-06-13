import java.util.Scanner;

public class Game {
    private Scanner input;
    private Player player;
    private boolean isPlaying;
    private int roomNumber;
    
    public Game() {
        input = new Scanner(System.in);
        isPlaying = true;
        roomNumber = 1;
    }

    public void start() {
        System.out.println("\nWelcome player.\nYou have just been teleported to a dungeon in an alternate dimension.\nI am the spirit who will guide you throughout this journey.\nYour objective is to earn 6767 gold and not die to escape this nightmare.\nTo begin, create a name for yourself.\nGood luck, and may you make it out alive.\n");

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println();
        player = new Player(name);

        System.out.println("You step inside the dungeon and encounter an armored bear. What do you do?");
        System.out.println("1. Pick up a sword from the corpse beside you and throw it like a spear at the bear's head.");
        System.out.println("2. Run because you are scared.");
        System.out.println("3. Charge the bear and attempt to wrestle it.\n");

        System.out.print("Enter your choice number: ");
        int choice1 = input.nextInt();
        System.out.println();

        if (choice1 == 1) {
            roomNumber++;
            System.out.println("Your spear bounces off of the bear's helmet. Now defenseless, you can do nothing as the bear slashes your hand off with his greataxe. You lose 25 HP. Having learned your lesson, you avoid the bear and run deeper into the cave, entering a new room.");
            player.setHealth(player.getHealth() - 25);
            System.out.println("\n" + player.getName() + ", you now have " + player.getHealth() + " HP and " + player.getGold() + " gold.");
        }
        else if (choice1 == 2) {
            roomNumber++;
            System.out.println("A fabulous choice. Being more agile than the bear, you avoid it by running around. Entering the next room in the cave, you find a lootbox with 676 gold and a chestplate that gives you 67 hp.");
            player.setHealth(player.getHealth() + 67);
            player.setGold(player.getGold() + 676);
            System.out.println("\n" + player.getName() + ", you now have " + player.getHealth() + " HP and " + player.getGold() + " gold.");
        }
        else if (choice1 == 3) {
            System.out.println("Charging the bear wasn't a smart idea. You get folded and die instantly. Better luck next time!");
        }
    }
}
