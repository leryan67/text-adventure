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
        int choice = input.nextInt();
        System.out.println();
    }
}
