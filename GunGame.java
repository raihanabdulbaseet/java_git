import java.util.Scanner;
class Player {
    String name;
    int health;

    Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    void takeDamage(int damage) {
        health -= damage;
    }

    boolean isAlive() {
        return health > 0;
    }
}

public class GunGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Player 1's name: ");
        String player1Name = scanner.nextLine();
        Player player1 = new Player(player1Name, 100);

        System.out.print("Enter Player 2's name: ");
        String player2Name = scanner.nextLine();
        Player player2 = new Player(player2Name, 100);

        while (player1.isAlive() && player2.isAlive()) {
            System.out.println(player1.name + "'s turn to shoot. Enter damage: ");
            int damage = scanner.nextInt();
            player2.takeDamage(damage);

            if (!player2.isAlive()) {
                System.out.println(player1.name + " wins!");
                break;
            }

            System.out.println(player2.name + "'s turn to shoot. Enter damage: ");
            damage = scanner.nextInt();
            player1.takeDamage(damage);

            if (!player1.isAlive()) {
                System.out.println(player2.name + " wins!");
            }
        }

        scanner.close();
    }
}