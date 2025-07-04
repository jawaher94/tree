import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Canary c = new Canary();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ask about the canary:");
        String input = sc.nextLine();

        if (input.contains("alive")) {
            System.out.println("Yes, it is alive: " + c.isAlive());
        } else if (input.contains("fly")) {
            System.out.println("Yes, it can fly: " + c.canFly());
        } else if (input.contains("move")) {
            System.out.println("Yes, it can move: " + c.canMove());
        } else if (input.contains("sing")) {
            System.out.println("Yes, it can sing: " + c.canSing());
        } else {
            System.out.println("Sorry, I don't know the answer.");
        }

        sc.close();
    }
}
